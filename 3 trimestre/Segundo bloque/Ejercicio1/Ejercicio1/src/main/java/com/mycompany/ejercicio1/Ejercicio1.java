package com.mycompany.ejercicio1;

import java.io.File;
//import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce el nombre del fichero:");
            String nFichero = sc.nextLine();

            File fichero = new File(nFichero);

            if (fichero.exists()) {
                System.out.println("El fichero existe.");
                System.out.println("Nombre:" + fichero.getName());
                System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
                System.out.println("Tamanio (bytes): " + fichero.length());
            } else {
                System.out.println("No existe este fichero.");
            }
            sc.close();
        } /*catch (IOException e) {             DA ERROR PORQUE JAVA DETECTA QUE ES IMPOSIBLE QUE SE 
            System.out.println("Error con el fichero");             LANCE ESA EXCEPCION
        }*/ catch (Exception e) {
            System.out.println("Error desconocido");
        }
    }
}
