package com.mycompany.ejercicio12;

/**
Desarrolla un programa que calcule la superficie (área, en m2) de una vivienda, tan solo 
* pidiendo al usuario las medidas de cada una de sus habitaciones (suponiendo que todas 
* las habitaciones sean cuadradas o rectangulares).

El programa deberá poder crear una vivienda, de la cual se debe conocer:

- Nombre del propietario.
- Valor de la vivienda.
- Dirección de la vivienda.
- Habitaciones.

De cada habitación, se debe saber:

- Nombre de la estancia (salón, baño, cocina…).
- Lado 1.
- Lado 2.

El main del programa preguntará al usuario el nombre, el valor de la vivienda, la dirección de la
vivienda y cuántas habitaciones tiene. Después, irá preguntando uno a uno los datos de cada habitación.
Al terminar las preguntas, creará los objetos correspondientes y llamará a un método de la clase Vivienda
encargado de calcular el área total (este método puede llamar a otros de la clase Habitación si es necesario).

Para finalizar, el programa mostrará por consola los metros totales de la vivienda.
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        
        String nombre =  System.console().readLine("Introduce un nombre: ");
        int  valor =  Integer.parseInt(System.console().readLine("Introduce un valor: "));
        String direccion =  System.console().readLine("Introduce una direccion: ");
        int numHabitaciones =  Integer.parseInt(System.console().readLine("Introduce un número de habitaciones: "));
        
        Habitacion[] habitaciones = new Habitacion[numHabitaciones];
        
        for (int i = 0; i < numHabitaciones; i++) {
        
            String nombreH =  System.console().readLine("Introduce una habitación: ");
            int lado1 =  Integer.parseInt(System.console().readLine("Introduce el lado 1: "));
            int lado2 =  Integer.parseInt(System.console().readLine("Introduce el lado 2: "));
           habitaciones[i] = new Habitacion (nombreH, lado1, lado2);  
        }
        Vivienda casa = new Vivienda (nombre, valor, direccion, habitaciones);
        
        casa.imprimirAreaH();
        System.out.println(casa);
        for (int i = 0; i <habitaciones.length; i++) {
            System.out.println(habitaciones[i]);
        }
    }
}
