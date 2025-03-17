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
public class Jugador {
    
    private int id;
    private String nombre;
    private String equipo;
    private int edad;

    public Jugador(int id, String nombre, String equipo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", nombre: " + this.nombre + ", equipo: " + this.equipo + ", edad: " + this.edad;
    }
    
    
}
