package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        int opcion = 0;
        while (opcion != 4) {

            System.out.println("OPCIONES: ");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Ver tareas de la lista");
            System.out.println("3. Eliminar tarea por posición");
            System.out.println("4. Salir del programa");

            try {
                System.out.println("Elige una opción: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Qué tarea deseas añadir? ");
                        String tarea = sc.nextLine();
                        if (tarea.isEmpty() || tarea.equals(null)) {
                            throw new IllegalArgumentException("Debes introducir una tarea. ");
                        }
                            tareas.add(tarea);
                        break;
                    case 2:
                        System.out.println("Lista tareas: ");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i+1) + ". " + tareas.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Qué tarea quieres eliminar? ");
                        int posicion = Integer.parseInt(sc.nextLine());
                        tareas.remove(opcion);
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("No existe esa opcion.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error. Introduce un numero.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error. No existe esa tarea.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            }
        }
    }
}
