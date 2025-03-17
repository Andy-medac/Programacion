

package com.mycompany.tema10_ejercicio9;


public class Carta_Francesa extends Carta{
    
    private Color color;

    public Carta_Francesa(Color color, String palo, int numero) {
        super(palo, numero);
        this.color = color;
    }

    public void mostrarCarta() {
        System.out.println("Carta Francesa: " + palo + " " + numero + " (" + color + ")");
    }
}
    
    
    

