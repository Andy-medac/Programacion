package com.mycompany.ejercicio4repaso;

public class Ejercicio4repaso {

    public static void main(String[] args) {
        Contacto c1 = new Contacto("Pedro", "611490150", "@medac.es");
        Contacto c2 = new Contacto("Antonio", "6000000", "@medac.es");
        
        Contacto[] g1 = {c1, c2};
        
        Grupo amigos = new Grupo("Amigos", g1);
        
        amigos.agregarContacto(c2);
        amigos.buscarContacto("Antonio");
        amigos.eliminarContacto("Pedro");
    }
}
        
        
        
    
