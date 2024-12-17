package com.mycompany.ejercicio4;

import java.util.Scanner;
/* Personas.
Crea una clase llamada personas que tenga como atributos el nombre, la edad, el género, y la nacionalidad, y como métodos tenga los habituales
(constructor, setters, getters y toString).

También se necesita un método que se llame presentacionIdioma() y que haga muestra una presentación de la persona en su idioma
(se admite en español, inglés, francés e italiano)

En el main, haz varias personas de ejemplo e imprimir su presentacionIdioma para ver que todo funciona correctamente*/
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Nombre: ");
        String nombre = sc.nextLine(); //esto incluye un salto del línea
        System.out.println("Edad: ");
        int edad = sc.nextInt();  //como al ser int no lo incluye, lo ponemos en la siguiente línea
        sc.nextLine();
        System.out.println("Género: ");
        String genero = sc.nextLine();
        System.out.println("Nacionalidad: ");
        String nacionalidad = sc.nextLine();
        
        Persona persona1 = new Persona (nombre, edad, genero, nacionalidad);
        
        
        
    }
}
