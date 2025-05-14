package com.mycompany.ejercicio5repaso;

public class Gato extends Animal {
    
    //Atributos
    private String color;
    
    //Constructor
    public Gato(String nombre, int edad, String color){
        super(nombre, edad);
        this.color = color;
    }
    
    //Setters
    public void setColor(String c){
        this.color = c;
    }
    
    //Getters
    public String getColor(){
        return color;
    }
    
    //Métodos obligatorios
    public String hacerSonido(){
        return "Miau";
    }
    
    public boolean esAdulto(){
        if (this.getEdad() >= 2) {
            return true;
        } else{
            return false;
        }
    }
}