package com.mycompany.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        boolean opcion1 = true;
        do {
            try {
                String linea;
                BufferedReader br = new BufferedReader(new FileReader("Tareas.txt"));
                ArrayList<String> listaTareas = new ArrayList<>();
                System.out.println("Lista de tareas: ");
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    listaTareas.add(linea);
                    br.close();
                    Scanner sc = new Scanner(System.in);
                    int opcion2 = 0;

                    do {
                        System.out.println("Menu:");
                        System.out.println("1. Aniadir nueva tarea.");
                        System.out.println("2. Mostrar tareas guardadas.");
                        System.out.println("3. Cerrar el programa.");
                        opcion2 = Integer.parseInt(sc.nextLine());
                        switch (opcion2) {
                            case 1:
                                System.out.println("Introduce la nueva tarea: ");
                                String nuevaTarea = sc.nextLine();
                                listaTareas.add(nuevaTarea);
                            case 2:
                                if (listaTareas.isEmpty()) {
                                    System.out.println("No hay tareas existentes.");
                                } else {
                                    System.out.println("Lista de tareas: ");
                                    for (int i = 0; i < listaTareas.size(); i++) {
                                        System.out.println(listaTareas.get(i));
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Cerrando el programa...");
                                BufferedWriter bw = new BufferedWriter(new FileWriter("Tareas.txt"));
                                for (int i = 0; i < listaTareas.size(); i++) {
                                    bw.write(listaTareas.get(i));
                                    bw.newLine();
                                }
                                sc.close();
                                bw.close();
                                opcion1 = false;
                                break;
                            default:
                                System.out.println("Esa opcion no existe.");
                        }
                    } while (opcion2 != 3);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un numero.");
            } catch (IOException e) {
                System.out.println("Error con el archivo: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            }
        } while (opcion1 != false);

    }
}
