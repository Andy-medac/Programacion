/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tema10_ejercicio9;

import java.util.Scanner;

/**
 *
 * Un juego de cartas online permite utilizar cartas tanto de la baraja española como de la baraja francesa.
Desarrolla un sistema que permita crear cartas de diferentes juegos. Todas las cartas tienen palo y número. 
* Todas las cartas deben obligatoriamente tener un método mostrarCarta() que muestre el palo y el número.
Las cartas españolas tienen también un atributo que permite guardar si son una carta numérica (1-7) o especial (sota, caballo, rey).
Las cartas francesas tienen también un atributo que permite guardar el color (rojo o negro).
En el main, crea una interfaz por consola que pregunte al usuario cuántas cartas va a utilizar para el juego. 
* Después, preguntará una a una que tipo de carta desea crear y, en función del tipo preguntará también los datos correspondientes.
Al terminar de introducir todas las cartas, se mostrará por consola el listado de cartas creadas, en el mismo orden que fueron creadas.
 */
public class Tema10_Ejercicio9 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("¿Cuántas cartas deseas crear? ");
        int totalCartas = sc.nextInt();
        
         Carta[] cartas = new Carta[totalCartas];
         
         for (int i = 0; i < totalCartas; i++) {
            System.out.println("\nCreando carta " + (i + 1) + ":");
            System.out.print("Elige el tipo de carta (1 para Española, 2 para Francesa): ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            
            System.out.print("Introduce el palo: ");
            String palo = sc.nextLine();
            System.out.print("Introduce el número (o valor) de la carta: ");
            String numero = sc.nextLine();
            
            if (opcion == 1) {
                // Carta Española
                System.out.print("¿Es numérica o especial? (1 para Numérica, 2 para Especial): ");
                int tipoInt = sc.nextInt();
                sc.nextLine();
                TipoCartaEspañola tipo = (tipoInt == 1) ? TipoCartaEspañola.Numerica : TipoCartaEspañola.Especial;
                
                cartas[i] = new Carta_Española(tipo, palo, opcion);
            } else if (opcion == 2) {
                // Carta Francesa
                System.out.print("Introduce el color (1 para ROJO, 2 para NEGRO): ");
                int colInt = sc.nextInt();
                sc.nextLine();
                Color color = (colInt == 1) ? Color.Rojo : Color.Negro;
                
                cartas[i] = new Carta_Francesa(color, palo, colInt);
            } else {
                System.out.println("Opción no válida, se creará una carta por defecto francesa en color ROJO.");
                cartas[i] = new Carta_Francesa(Color.Rojo, palo, opcion);
            }
        }
    }
}
