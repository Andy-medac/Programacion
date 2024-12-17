package com.mycompany.ejercicio2;

public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    
    public Jugador(String n, int d, String p){
        this.nombre = n;
        this.edad = d;
        this.posicion = p;
    }
    
    //Creamos los GET
    public String getNombre(){
        return this.nombre;  
    }
    public int getEdad(){
        return this.edad;
    }
    public String getPosicion(){
        return this.posicion;
    }
    
    //Creamos los SET
    public void setNombre(String n){
        this.nombre = n;
    }
    public void setEdad(int d){
        this.edad = d;
    }
    public void setPosicion(String p){
        this.posicion = p;
    }
    
    //Método para imprimir los jugadores
    public void imprimirJugador(){
        System.out.println("Nombre: " + this.nombre + " , tiene " + this.edad + " juega en la posicion " + this.posicion);
    }
}
