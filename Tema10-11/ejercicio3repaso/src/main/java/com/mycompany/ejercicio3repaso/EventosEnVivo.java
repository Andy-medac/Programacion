package com.mycompany.ejercicio3repaso;

public class EventosEnVivo extends EmpresaStreaming{
    private int fecha;
    private int horaInicio; 
    private double precioEntrada;
    private int capacidadMax;

    public EventosEnVivo(int f, int h, double pre, int c, String titulo, int duracion, float puntuacion) {
        super(titulo, duracion, puntuacion);
        this.fecha = f;
        this.horaInicio = h;
        this.precioEntrada = pre;
        this.capacidadMax = c;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int f) {
        this.fecha = f;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int h) {
        this.horaInicio = h;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double pre) {
        this.precioEntrada = pre;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int c) {
        this.capacidadMax = c;
    }

    @Override
    public String toString() {
        return super.toString() + " fecha=" + fecha + ", horaInicio=" + horaInicio + ", precioEntrada=" + precioEntrada + ", capacidadMax=" + capacidadMax + '}';
    }
    
    @Override
    public abstract void  mostrarInformacion();
}