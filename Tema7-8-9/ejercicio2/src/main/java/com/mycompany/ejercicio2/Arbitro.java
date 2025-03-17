package com.mycompany.ejercicio2;

public class Arbitro {
     //Atributos
    private String nombre;
    private int edad;
    private String categoria;
    
    //Constructor
    public Arbitro (String n, int d, String c) {
    
        this.nombre = n;
        this.edad = d;
        this.categoria = c;
    }
    
    //Creamos los get
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getCategoria(){
        return this.categoria;
    }
    
    //Creamos los SET
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setEdad(int d){
        this.edad = d;
    }
    public void setCategoria(String c){
        this.categoria = c;
    }
    
    //Método para imprimir por pantalla
    public void imprimirArbitro (){
        System.out.println("El arbitro es " + this.nombre + " tiene " + this.edad + " su categoria es " + this.categoria);
    }
}
