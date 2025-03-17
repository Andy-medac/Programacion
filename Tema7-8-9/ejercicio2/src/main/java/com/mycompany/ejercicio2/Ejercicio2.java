package com.mycompany.ejercicio2;

/*
Proyecto La liga

Supongamos que vamos a desarrollar una aplicación deportiva sobre fútbol
La liga tiene equipos, jugadores y árbitros
Los equipos tienen una ciudad, un número de socios y un presupuesto anual
Los jugadores tienen un nombre, una edad y una posición (Delantero, defensa..)

Los árbitros tienen nombre, edad y categoría (nacional o internacional)

En el main, crea 5 equipos, 5 jugadores y 2 árbitros
*/

public class Ejercicio2 {

    public static void main(String[] args) {
       //Creamos los equipos
        Equipo equipo1 = new Equipo ("Español", 111, 100000);
        Equipo equipo2 = new Equipo ("Sevilla", 222, 100000);
        Equipo equipo3 = new Equipo ("Real Jaen", 333, 10000);
        Equipo equipo4 = new Equipo ("Cordoba", 444, 10000);
        Equipo equipo5 = new Equipo ("Martos", 555, 10000);
        
        //Creamos los jugadores
        Jugador jugador1 = new Jugador ("Juan", 24, "delantero");
        Jugador jugador2 = new Jugador ("Miguel", 30, "defensa");
        Jugador jugador3 = new Jugador ("Nathan", 31, "lateral derecho");
        Jugador jugador4 = new Jugador ("Alejandro", 21, "central");
        Jugador jugador5 = new Jugador ("Jose", 26, "lateral izquierdo");
        
        //Creamos los arbitros
        Arbitro arbitro1 = new Arbitro ("Guillermo", 29, "internacional");
        Arbitro arbitro2 = new Arbitro ("Clara", 25, "nacional");
        
        //Mostramos
        equipo4.imprimirEquipos();
        
        jugador2.imprimirJugador();
        
        arbitro1.imprimirArbitro();
        arbitro2.imprimirArbitro();
    }
}
