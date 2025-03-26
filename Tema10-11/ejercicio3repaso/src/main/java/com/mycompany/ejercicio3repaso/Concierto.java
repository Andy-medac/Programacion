package com.mycompany.ejercicio3repaso;

public class Concierto extends EventosEnVivo{
    private String artista;
    private String ubicacion;

    public Concierto(int f, int h, double pre, int c, String titulo, int duracion, float puntuacion, String ar, String u) {
        super(f, h, pre, c, titulo, duracion, puntuacion);
        this.artista = ar;
        this.ubicacion = u;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String ar) {
        this.artista = ar;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String u) {
        this.ubicacion = u;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("El artista " + this.artista + " ubicacion: " + this.ubicacion);
    }
}
