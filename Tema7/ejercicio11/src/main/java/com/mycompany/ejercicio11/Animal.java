package com.mycompany.ejercicio11;

public class Animal {
 
    private String nombre;
    private String tipo;
    private int edad;
    
    //Constuctor
    
    public Animal(String n, String t, int e){
        this.nombre = n;
        this.tipo = t;
        this.edad = e;
    }
    
    //Getters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //Setters 
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void setEdad(int e){
        this.edad = e;
    }
    
    //Métodos
    
    public String toString(){
        return "Nombre: " + this.nombre + "/ tipo: " + this.tipo + "/ edad: " + this.edad;
    }
}
