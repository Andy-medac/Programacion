package com.mycompany.ejercicio12;

public class Habitacion {
    private String nombre;
    private int lado1;
    private int lado2;
    
    //Constuctor
    
    public Habitacion(String n, int l1, int l2){
        this.nombre = n;
        this.lado1 = l1;
        this.lado2 = l2;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    //Métodos
    
    public String toString() {
        return "nombre: " + this.nombre + "/ lado1: " + this.lado1 + "/ lado2: " + this.lado2;
    }
    
    public int imprimirArea(){
        int resultado = this.lado1*this.lado2;
        return resultado;
    }
    
}
