package com.mycompany.ejercicio7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        HashMap<String, String> loginUsuarios = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String nombre = "";
        String contrasena = "";

        while (opcion != 4) {

            System.out.println("-------------- MENÚ --------------");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Mostrar usuarios registrados");
            System.out.println("4. Salir del programa");
            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Introduce un nombre de usuario: ");
                        nombre = sc.nextLine();
                        if (loginUsuarios.containsKey(nombre)) {
                            System.out.println("Este usuario ya existe.");
                        } else {
                            System.out.println("Introduce una contrasena: ");
                            contrasena = sc.nextLine();
                            loginUsuarios.put(nombre, contrasena);
                        }
                        break;
                    case 2:
                        System.out.println("Introduce un nombre de usuario: ");
                        nombre = sc.nextLine();
                        if (loginUsuarios.containsKey(nombre)) {
                            System.out.println("Introduce una contrasena:");
                            contrasena = sc.nextLine();
                            if (loginUsuarios.get(nombre).equals(contrasena)) {
                                System.out.println("Inicio de sesion valido!");
                            } else {
                                System.out.println("Contrasena incorrecta.");
                            }
                        } else {
                            System.out.println("No existe ese usuario.");
                        }
                        break;
                    case 3:
                        Iterator<Map.Entry<String, String>> it = loginUsuarios.entrySet().iterator();
                        System.out.println("Usuarios registrados: ");
                        while (it.hasNext()) {
                            Map.Entry<String, String> entrada = it.next();
                            System.out.println(entrada.getKey());
                        }
                        break;
                    case 4:
                        System.out.println("Cerrando el programa...");
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Valor introducido invalido.");
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            }
        }
    }
}
