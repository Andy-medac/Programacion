package com.mycompany.ejercicio3repaso;

public class EventoDeportivo extends EventosEnVivo{
    private String equiposParticipates;
    private String lugar;
    
    public EventoDeportivo(int f, int h, double pre, int c, String titulo, int duracion, float puntuacion, String equiposParticipantes, String lugar){
        super(f, h, pre, c, titulo, duracion, puntuacion);
        this.equiposParticipates = equiposParticipantes;
        this.lugar = lugar;
    }

    public String getEquiposParticipates() {
        return equiposParticipates;
    }

    public void setEquiposParticipates(String equiposParticipates) {
        this.equiposParticipates = equiposParticipates;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return super.toString() + " equiposParticipates=" + equiposParticipates + ", lugar=" + lugar + '}';
    }
}
