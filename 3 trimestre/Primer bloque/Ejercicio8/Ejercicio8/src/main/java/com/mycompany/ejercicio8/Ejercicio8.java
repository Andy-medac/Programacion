package com.mycompany.ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de palabras:");
        try {
            String cadena = sc.nextLine();
            if (cadena == null || cadena.isEmpty()) {
                throw new IllegalArgumentException("La cadena no puede ser nula.");
            }
            Set<String> separadas = new HashSet<>(Arrays.asList(cadena.split(",")));
            ArrayList<String> palabras = new ArrayList<>(separadas);
            Collections.sort(palabras);

            for (int i = 0; i < palabras.size(); i++) {
                System.out.println(palabras.get(i));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Valor no valido.");
        } catch (Exception e) {
            System.out.println("Error desconocido. ");
        } 
    }
}
