package com.edi.servicioweb.servicios;



import com.edi.servicioweb.modelos.Curso;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Arrays;
import java.util.List;

//Una vez implementamos a  ServicioWs
//Utilizamos  a @WebService para indicar que es un WebService
// mediante la ruta del package hacia ServicioWs.
//El endpointInterface indica que es un servicio web


@WebService(endpointInterface = "com.edi.servicioweb.servicios.ServicioWs")
public class ServicioWsImplement implements ServicioWs{
    //Declaro una variable tipo int de nombre contador
    private int contador;

//Declaramos los metodos de la interfaz ServicioWs


    @Override
    public String saludar(String persona) {
        //el this hace referencia a la instancia del servicio web en este caso es el objeto ServicioWsImplement
        System.out.println("Imprimiendo dentro del servicio web con instancia" + this);
        contador++;
        System.out.println("Valor del contador en un metodo saludar es:" + contador);
        return "Hola como estas " + persona + "?";
    }

    //Utilizamos a @WebMethod para indicar que es un metodo web
    @WebMethod

//De igual manera seria si utilizamos los metodos de un repositorio
    @Override
    public List<Curso> listar() {
        return Arrays.asList(new Curso("Java"), new Curso("PHP"), new Curso("Jakarta"));
    }

    //En el metodo crear llamamos a Nombre con nuestro get y set
    @Override
    public Curso crear(Curso curso) {
        System.out.println("Creando curso" + curso);
        System.out.println("Curso creado con exito " + curso.getNombre());
        Curso nuevoCurso = new Curso();
        nuevoCurso.setNombre(curso.getNombre());
        return nuevoCurso;
    }
}
