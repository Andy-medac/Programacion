package com.mycompany.ejercicio4repaso;

public class Contacto {
    
    //Atributos
    private String nombre;
    private String tlf;
    private String email;
    
    //Constructor
    public Contacto(String n, String tlf, String e){
        this.nombre = n;
        this.tlf = tlf;
        this.email = e;
    }
    
    //Setters
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setTlf(String tlf){
        this.tlf = tlf;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getTlf(){
        return this.tlf;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    //toString
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", tlf=" + tlf + ", email=" + email + '}';
    }
}

