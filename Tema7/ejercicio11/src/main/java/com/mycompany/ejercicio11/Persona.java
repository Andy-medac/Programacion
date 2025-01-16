package com.mycompany.ejercicio11;

public class Persona {
    private String nombre;
    private String dni;
    private int telefono;
    
    //Constructor
    
    public Persona(String n, String d, int t){
        this.nombre = n;
        this.dni = d;
        this.telefono = t;
    }
    
    //Getters
    
    public String getNombre (){
        return this.nombre;
    }
    
    public String getDni(){
            return this.dni;
     }
    
    public int getTelefono(){
        return this.telefono;
    }
    
    //Setters
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setDni(String d){
        this.dni = d;
    }
    
    public void setTelefono(int t){
        this.telefono = t;
    }
    
    //Métodos
    
    public String toString(){
        return "Nombre: " + this.nombre + "/ dni: " + this.dni + "/ teléfono: " + this.telefono;
    }
}
