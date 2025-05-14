package com.mycompany.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {

        String tareas[] = new String[5];
        int posicion = 0;
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("------ OPCIONES PARA TAREA: ------");
            System.out.println("1. VER TODAS LAS TAREAS");
            System.out.println("2. AÑADIR TAREA");
            System.out.println("3.ELIMINAR TAREA");
            System.out.println("4. SALIR DEL PROGRAMA");

            try {
                opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        for (int i = 0; i < tareas.length; i++) {
                            if (tareas[i] == null) {
                                System.out.println((i + 1) + ". Sin tarea ");
                            } else {
                                System.out.println(tareas[i]);
                            }
                        }
                        break;
                    case 2:
                        posicion = Integer.parseInt(System.console().readLine("En qué posición quieres poner la tarea? "))-1;
                        String tarea = System.console().readLine("Qué tarea quieres añadir? ");
                        tareas[posicion] = (posicion + 1) + ". " + tarea;
                        break;
                    case 3:
                        posicion = Integer.parseInt(System.console().readLine("Que tarea quieres eliminar? ")) -1;
                        if (tareas[posicion] == null) {
                            throw new NullPointerException();
                        } else {
                            tareas[posicion] = (posicion + 1) + ". Sin tarea";
                        }
                        break;
                    case 4:
                        System.out.println("Cerrando el programa...");
                        break;
                    default: 
                        System.out.println("Opcion invalida.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Límite de tareas sobrepasado. ");
            } catch (NumberFormatException e) {
                System.out.println("Error, introduce un número.");
            } catch (NullPointerException e) {
                System.out.println("No hay más tareas existentes.");
            } catch (Exception e){
                System.out.println("Error desconocido.");
            }
        }
    }
}
