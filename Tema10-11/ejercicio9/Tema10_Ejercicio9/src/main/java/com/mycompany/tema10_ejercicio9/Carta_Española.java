package com.mycompany.tema10_ejercicio9;

public class Carta_Española extends Carta{
    private TipoCartaEspañola tipo;

    public Carta_Española(TipoCartaEspañola tipo, String palo, int numero) {
        super(palo, numero);
        this.tipo = tipo;
    }
    
     @Override
    public void mostrarCarta() {
        System.out.println("Carta Española: " + palo + " " + numero + " (" + 
                           (tipo == TipoCartaEspañola.Numerica ? "Numérica" : "Especial") + ")");
    }
    
}
