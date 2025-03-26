package com.mycompany.ejercicio1repaso;

/**
 *
 * @author PC221
 */
public class Ejercicio1repaso {

    public static void main(String[] args) {
        
        Vuelo vuelo1 = new Vuelo("Madrid", "Tokio", 900, 120, 10758.7d, 905.9d);
        
        System.out.println(vuelo1.calcularIngresosTotales());
        System.out.println(vuelo1.esVueloLargo());
        System.out.println(vuelo1.calcularCombustible());
    }
}
