package com.edi.servicioweb.servicios;

//Esto va ser consumido esto es nuestro WebSeervice
//Un metodo me permita generar objetos

import com.edi.servicioweb.modelos.Curso;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface ServicioWs {
    //Implementamos un metodo para saludar a una persona
    String saludar(String persona);
    //Implementamos un metodo paa listar los cursos
    List<Curso> listar();
    //Recibe el objeto curso y lo guarda en la base de datos
    Curso crear(Curso curso);
}
