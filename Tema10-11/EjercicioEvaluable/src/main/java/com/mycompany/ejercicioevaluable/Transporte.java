package com.mycompany.ejercicioevaluable;

public class Transporte {
    
    private String nombre;
    private Parada[] paradas;
    private int tiempo;
    
    public Transporte(String n, Parada[] p, int t){
        this.nombre = n;
        this.paradas = p;
        this.tiempo = t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public Parada[] getParadas() {
        return paradas;
    }

    public void setParadas(Parada[] p) {
        this.paradas = p;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int t) {
        this.tiempo = t;
    }
    
    //Métodos especiales
    public void calcularViaje(Parada[] p, int t){
        System.out.println("Duración viaje");
    };
}
