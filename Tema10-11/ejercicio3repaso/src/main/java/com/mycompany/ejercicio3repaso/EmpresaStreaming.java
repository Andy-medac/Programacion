package com.mycompany.ejercicio3repaso;

public abstract class EmpresaStreaming {
    
    private  String titulo;
    private int duracion;
    private float puntuacion;

    public EmpresaStreaming(String t, int d, float p) {
        this.titulo = t;
        this.duracion = d;
        this.puntuacion = p;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "EmpresaStreaming{" + "titulo=" + this.titulo + ", duracion=" + this.duracion + ", puntuacion=" + this.puntuacion;
    }
    
    public boolean esContenidoPopular(){
        return this.puntuacion>8;
    }
    
    public abstract void mostrarInformacion();
}
