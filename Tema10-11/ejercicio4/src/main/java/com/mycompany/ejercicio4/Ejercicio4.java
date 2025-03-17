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
public class Ejercicio4 {

    public static void main(String[] args) {
        Atacante a1 = new Atacante(3688, "Adrian", "Mengibar", 18, 89, 94);
        Atacante a2 = new Atacante(12, "Manuel", "Villargordo", 17, 80, 90);
        
        Defensor d1 = new Defensor(1234, "Alvaro", "Real Jaen", 16, 93);
        Defensor d2 = new Defensor(374, "Marcos", "Malaga", 30, 89);
        
        //También podemos crear objetos de la siguiente manera: 
        // Jugador [] jugadores = {
        // Jugador a1 = new Atacante (3688, "Adrian", "Mengibar", 18, 89, 94)
        // Jugador d1 = new Defensor(1234, "Alvaro", "Real Jaen", 16, 93)
        // };
        
        //El polimorfismo indica que se pueden crear objetos en el tipo de su padre.
        Partido.simularJugada(a1, d1);
        Partido.simularJugada(a2, d2);
        Partido.simularJugada(a1, d2);
        Partido.simularJugada(a2, d1);
    }
}
