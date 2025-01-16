package com.mycompany.ejercicio13;

public class Editorial {
    
    private String nombre;
    private String pais;
    private int cantidadLibrosP;
    
    public Editorial (String n, String p, int c){
        this.nombre = n;
        this.pais = p;
        this.cantidadLibrosP = c;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getCantidadLibrosP() {
        return cantidadLibrosP;
    }
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCantidadLibrosP(int cantidadLibrosP) {
        this.cantidadLibrosP = cantidadLibrosP;
    }

    @Override
    public String toString() {
        return "nombre. " + nombre + ", pais: " + pais + ", cantidadLibrosP: " + cantidadLibrosP;
    }

    
}
