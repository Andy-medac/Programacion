/*
 * Crea una clase equipo que tenga nombre, ciudad, numero de socios y jugadores.
    De los jugadores se sabe su nombre, posición, salario y edad.
    En la ckase equipo debe haber un método especial que imprima todos los nombres de sus jugadores (sólo los nombres)
 */

package com.mycompany.asociacioncompuesta;

public class AsociacionCompuesta {

    public static void main(String[] args) {
        Jugador j1 = new Jugador ("juanito", "delantero", 1010, 20);
        Jugador j2 = new Jugador ("Adrian", "portero", 9999, 18);
        Jugador jugadores[]= {j1, j2};
        Equipo equipo1 = new Equipo("Real Madrid", "Madrid", 2837, jugadores);
        
        System.out.println(equipo1);
        
      equipo1.ImprimirNombresJ();
    }
}
