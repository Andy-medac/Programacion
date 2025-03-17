package com.mycompany.ejercicioevaluable;

public class Parada {
    //atributos
    private String nombre;

    //constructor
    public Parada(String nombre) {
        this.nombre = nombre;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    //toString
    public String toString() {
        return"nombre: " + this.nombre;
    }
    
    
}
