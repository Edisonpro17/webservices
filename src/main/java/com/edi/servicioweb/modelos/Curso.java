package com.edi.servicioweb.modelos;

public class Curso {
    //Declaracion de atributos tipo private
//    private Long id;
    private String nombre;
  //  private String descripcion;
    //private String codigo;
    //private String estado;
    //private String fechaCreacion;


public Curso () {
}
//Implementamos un constructor que inicialice el atributo nombre
public Curso (String nombre) {
    //this.id = id;
    this.nombre = nombre;
    //this.descripcion = descripcion;
    //this.codigo = codigo;
    //this.estado = estado;
    //this.fechaCreacion = fechaCreacion;
}
//Geters y Seters
    public String getNombre() {
        return nombre;
    }
    //Metodo setNombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}