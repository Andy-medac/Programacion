/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5repaso;

public class Loro extends Animal {
  
    //Atributos
    private boolean puedeHablar;
    
    //Constructor
    public Loro(String nombre, int edad, boolean ph){
        super(nombre, edad);
        this.puedeHablar = ph;
    }
    
    //Setters
    public void setPuedeHablar(boolean ph){
        this.puedeHablar = ph;
    }
 
    //Getters
    public boolean getPuedeHablar(){
        return this.puedeHablar;
    }
    
    //Métodos obligatorios
    public String hacerSonido(){
        if (this.puedeHablar == true) {
            return "Hola";
        }else{
            return "Craa";
        }
    }
    
    public boolean esAdulto(){
        if (this.getEdad() >= 2) {
            return true;
        }else{
            return false;
        }
    }
    
}
