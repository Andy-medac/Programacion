package com.mycompany.asociacioncompuesta;

public class Equipo {
    private String nombre;
    private String ciudad;
    private int numSocios;
    private Jugador[] jugadores;
    
    //Constructor
    public Equipo(String n, String c, int num, Jugador[] j){
        this.nombre = n;
        this.ciudad = c;
        this.numSocios = num;
        this.jugadores = j;
    }
    
    //Getters
    
    public Jugador[] getJugadores(){
        return this.jugadores;
    }
    
    //Setters
    
    //toString
    public String toString(){
        return "Nombre: " + this.nombre + " / ciudad: " + this.ciudad + " / num Socios: " + this.numSocios + " / jugadores: "+ this.jugadores;
    }
    
    public void ImprimirNombresJ (){
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(this.jugadores[i].getNombre());
        }
        
    }
}
