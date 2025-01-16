package com.mycompany.ejercicio13;

public class Autor {
    //atributos
    private String nombre;
    private String nacionalidad;
    
    //Constructor
    public Autor (String n, String na){
        this.nombre = n;
        this.nacionalidad = na;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String toString() {
        return "nombre: " + nombre + ", nacionalidad: " + nacionalidad;
    }
    
    
}
