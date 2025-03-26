package com.mycompany.ejercicio3repaso;

public class EventoBajaDemanda  extends EmpresaStreaming{
    private int anioEstreno;
    private String director;
    
    public EventoBajaDemanda(int anioEstreno, String director, String titulo, int duracion, float puntuacion){
    
    super(titulo, duracion, puntuacion);
    this.anioEstreno = anioEstreno;
    this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int a) {
        this.anioEstreno = a;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String di) {
        this.director = di;
    }

    @Override
    public String toString() {
        return super.toString() + " anioEstreno=" + anioEstreno + ", director=" + director + '}';
    }
}
