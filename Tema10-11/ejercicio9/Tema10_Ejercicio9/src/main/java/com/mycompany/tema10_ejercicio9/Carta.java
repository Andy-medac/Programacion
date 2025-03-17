

package com.mycompany.tema10_ejercicio9;


public abstract class Carta {
    public String palo;
    public int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }
    

    
    public abstract void mostrarCarta();
    
    
}
