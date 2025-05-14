package com.mycompany.ejercicio5repaso;

public abstract class Animal {
    
    //Atributos
    private String nombre;
    private int edad;
    
    
    //Constructor
    public Animal(String n, int e){
        this.nombre = n;
        this.edad = e;
    }
    
    //Setters
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setEdad(int e){
        this.edad = e;
    }

    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //Método obligatorio
    public abstract String hacerSonido();
    
    public abstract boolean esAdulto();
    
}
