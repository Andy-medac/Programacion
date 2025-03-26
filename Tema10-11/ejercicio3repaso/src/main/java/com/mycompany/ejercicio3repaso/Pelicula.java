package com.mycompany.ejercicio3repaso;

public class Pelicula extends EventoBajaDemanda{
    private float presupuesto;
    
    public Pelicula (int anioEstreno, String director, String titulo, int duracion, float puntuacion, float presupuesto){
        super(anioEstreno, director, titulo, duracion, puntuacion);
        this.presupuesto = presupuesto;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float p) {
        this.presupuesto = p;
    }

    @Override
    public String toString() {
        return  super.toString() + " presupuesto=" + presupuesto + '}';
    }
  
}
