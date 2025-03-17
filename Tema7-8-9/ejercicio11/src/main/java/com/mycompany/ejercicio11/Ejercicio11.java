package com.mycompany.ejercicio11;

/**
En un zoológico existen 5 zonas (sabana, oceano, selva, granja y artico). Cada zona se deben saber:
* - persona que cuida a los animales
* - metros cuadrados
* .- presupuesto mensual asignado a la zona
* - si está abierta al público o no
* - lista de animales
* 
* de las personas cuidadoras se debe saber:
* 
* - Nombre
* - dni
* - telefono
* 
* de los animales se necesita saber:
* -nombre
* -tipo (mamífero, reptil, ave)
* -edad
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Persona persona1 = new Persona ("Marina", "28372301K", 698342313);
        Persona persona2 = new Persona ("Carolina", "23429710L", 632328709);
        
        Animal animalesOceano[] = {
        new Animal ("Tiburon Ballena", "mamífero", 50),
        new Animal ("Cangrejo rojo", "Crustáceo", 8),
        new Animal ("Delfin", "mamifero", 2)
     };
        
        Animal animalesSelva[] = {
            new Animal ("Mono", "mamifero", 20),
            new Animal ("Serpiente", "reptil", 10),
            new Animal ("Mariposa", "insecto", 1)
        };
        
        Zona oceano = new Zona (persona1, 5000, 170000, true, animalesOceano);
        Zona selva = new Zona(persona2, 8500, 27000, false, animalesSelva);
        
        System.out.println(oceano);
        oceano.imprimirAnimales();
        
        System.out.println("");
        
        System.out.println(selva);
        selva.imprimirAnimales();
    }
}
