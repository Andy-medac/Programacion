package com.mycompany.ejercicio4;

/**
 * Crea la estructura de clases necesarias para un videojuego de fútbol como
 * FIFA. Simplificando, supongamos que tenemos dos tipos de jugadores, atacantes
 * y defensores. Todos los jugadores tienen los siguientes datos:
 *
 * id: Número único para identificar al jugador. nombre: Nombre del jugador.
 * equipo: Nombre del equipo al que pertenece. edad: edad del jugador. Los
 * atacantes tendrán:
 *
 * habilidadControl (0-100). potenciaDisparo (0-100). Puedes modificar estos
 * datos o añadir otros que consideres importantes. Los defensores tendrán:
 *
 * habilidadDefensa (0-100). Puedes modificar estos datos o añadir otros que
 * consideres importantes. Crea una clase Partido que contenga un método
 * simularJugada() que permita pasar por parámetro un jugador atacante y otro
 * defensor, y nos indique quién gana la jugada (gana quien tenga la combinación
 * más alta según la fórmula que tú definas en base a sus habilidades).
 *
 * Prueba el programa creando varios atacantes, defensores, simulando varias
 * jugadas e imprimiendo los resultados.
 */
public class Defensor extends Jugador{
    
    private int habilidadDefensa;
    
    public Defensor(int id, String nombre, String equipo, int edad, int hD){
        super(id, nombre, equipo, edad);
        this.habilidadDefensa = hD;
    }

    public int getHabilidadDefensa() {
        return habilidadDefensa;
    }

    public void setHabilidadDefensa(int habilidadDefensa) {
        this.habilidadDefensa = habilidadDefensa;
    }

    @Override
    public String toString() {
        return super.toString() + " habilidad de defensa: " + this.habilidadDefensa;
    }
    
    
}
