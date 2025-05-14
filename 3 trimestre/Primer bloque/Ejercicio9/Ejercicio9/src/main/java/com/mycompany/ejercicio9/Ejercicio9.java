package com.mycompany.ejercicio9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>(); //creamos la cola
        int opcion = 0;
        String persona = "";
        Scanner sc = new Scanner(System.in);

        while (opcion != 5) {
            System.out.println("Introduce una opcion:");
            System.out.println("1. Anadir persona a la cola");
            System.out.println("2. Atender a persona");
            System.out.println("3. Ver siguiente persona en la cola");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Salir del programa");

            try {
                
                opcion = Integer.parseInt(sc.nextLine());
                
                switch (opcion) {
                    case 1:
                        System.out.println("introduce el nombre:");
                        persona = sc.nextLine();
                        if (persona.isEmpty()) {
                            throw new IllegalArgumentException("El nombre no puede estar vacio.");
                        } else {
                        cola.offer(persona); //introducimos el valor en la cola con .offer
                        }
                        break;
                    case 2:
                        if (cola.isEmpty()) {
                            System.out.println("La cola está vacia."); //en caso de que esté vacía, mostramos un mensaje
                        } else {
                            System.out.println("Se atenderá a la primera persona de la cola.");
                            System.out.println("Persona atendida: " + cola.poll()); //retiramos el primer valor de la cola y lo mostramos con .poll
                        }
                        break;
                    case 3:
                        if (cola.isEmpty()) {
                            System.out.println("La cola está vacia.");
                        } else {
                            System.out.println("Siguiente persona atendida: " + cola.peek()); //mostramos el siguiente con .peek (sin eliminarlo)
                        }
                        break;
                    case 4:
                        if (cola.isEmpty()) {
                            System.out.println("La cola está vacia.");
                        } else {
                            System.out.println("Personas por atender en la cola:");
                            System.out.println(cola);
                        }
                        break;
                    case 5:
                        System.out.println("Cerrando el programa...");
                    default:
                        System.out.println("Esa opcion no existe.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error debes introducir un numero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            } 
        }
        sc.close();
    }
}
