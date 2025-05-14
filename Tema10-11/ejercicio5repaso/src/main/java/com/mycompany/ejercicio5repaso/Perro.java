
package com.mycompany.ejercicio5repaso;

public class Perro extends Animal {
    
    //Atributos
    private String raza;
    
    //Constructor
    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza = this.raza;
    }
    
    //Setters
    public void setRaza(String r){
        this.raza = r;
    }
    
    //Getters
    public String getRaza(){
        return this.raza;
    }
    
    //Métodos obligatorios
    public String hacerSonido(){
        return "Guau";
    }
    
    public boolean esAdulto(){
        if (this.getEdad() >= 2) {
            return true;
        }else{
            return false;
        }
    }   
}
