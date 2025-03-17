package com.mycompany.asociacionsimple;

public class Persona {
    
    //atributos
    private String nombre;
    private String dni;
    private String nacionalidad;
    
    //Constructor
    public Persona(String n, String d, String na){
        this.nombre = n;
        this.dni = d;
        this.nacionalidad = na;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    //ToString
    public String toString(){
        return "Nombre: " + this.nombre + "/ DNI: " + this.dni + "/ nacionalidad: " + this.nacionalidad;
    }
}
