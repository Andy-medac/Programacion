package com.mycompany.ejercicio6;

public class Fraccion {
    //Atributos
    private float numerador;
    private float denominador;

    //Constructor
    public Fraccion(float n, float d){
        this.numerador= n;
        this.denominador = d;
    }
    
    //Getters
    public float getNumerador(){
        return this.numerador;
    }
    
    public float getDenominador(){
        return this.denominador;
    }
    
    //Setters
    public void setNumerador (float n){
        this.numerador = n;
    }
    
    public void setDenominador(float d){
        this.denominador = d;
    }
    
    //Métodos
    
    
    public String toString (){
              float resultado = this.numerador/this.denominador;
              return "El resultado de la división es de: " + resultado;
            }
    
    public void imprimirNumerador(){
        System.out.println("El numerador es: " + this.numerador);
    }
    
    public void imprimirDenominador(){
        System.out.println("El denominador es: " + this.denominador);
    }
   
    public void exacto (){
        if (this.numerador%this.denominador == 0) {
            System.out.println("La división es exacta");
        }
        else{
            System.out.println("La división no es exacta");
        }
    }
}
