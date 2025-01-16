package com.mycompany.asociacioncompuesta;

public class Jugador {
    private String nombre;
    private String posicion;
    private int salario;
    private int edad;
    
    //Constructor
    public Jugador(String n, String p, int s, int e){
        this.nombre = n;
        this.posicion = p;
        this.salario = s;
        this.edad = e;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    //setters
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    //toString
    
    public String toString(){
        return "nombre " + this.nombre + " / posicion: " + this.posicion + " / salario: " + this.salario + " / edad: " + this.edad;
    }
}
