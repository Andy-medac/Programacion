package com.mycompany.ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        HashMap<String, Integer> agendaContactos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        int telefono = 0;

        while (opcion != 5) {

            System.out.println("OPCIONES: ");
            System.out.println("1. Añadir nuevo contacto");
            System.out.println("2. Consultar número de contacto");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Eliminar un contacto");
            System.out.println("5. Salir del programa");
            opcion = Integer.parseInt(sc.nextLine());

            try {

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce un nombre: ");
                        nombre = sc.nextLine();
                        if (nombre.isEmpty() || nombre.equals(null)) {
                            throw new IllegalArgumentException("Debes introducir una tarea. ");
                        }
                        System.out.println("Introduce un telefono: ");
                        telefono = Integer.parseInt(sc.nextLine());
                        agendaContactos.put(nombre, telefono);
                        break;
                    case 2:
                        System.out.println("Introduce un nombre: ");
                        nombre = sc.nextLine();
                        if (nombre.isEmpty() || nombre.equals(null)) {
                            throw new IllegalArgumentException("Debes introducir un nombre. ");
                        }
                        else if (agendaContactos.containsKey(nombre)) {
                            System.out.println("El numero de telefono es " + agendaContactos.get(nombre));
                        } else {
                            System.out.println("No existe ese contacto.");
                        }
                        break;
                    case 3:
                        Iterator<Map.Entry<String, Integer>> it = agendaContactos.entrySet().iterator();
                        System.out.println("Usuarios registrados: ");
                        while (it.hasNext()) {
                            Map.Entry<String, Integer> entrada = it.next();
                            System.out.println(entrada.getKey());
                        }
                        break;
                    case 4:
                        System.out.println("Introduce el nombre del contacto: ");
                        nombre = sc.nextLine();
                        agendaContactos.remove(nombre);
                    case 5:
                        System.out.println("Cerrando el programa...");
                        break;
                    default:
                        System.out.println("Debes introducir una opción existente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            }
        }
    }
}
