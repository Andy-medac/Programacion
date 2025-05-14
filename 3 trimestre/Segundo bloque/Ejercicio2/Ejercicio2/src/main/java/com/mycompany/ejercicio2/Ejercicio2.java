package com.mycompany.ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) {
    
         try (BufferedReader br = new BufferedReader(new FileReader("holaCaracola.txt")); //Incluimos el reader y el writer en el mismo try
                 BufferedWriter bw = new BufferedWriter(new FileWriter("copia.txt"))) {
                String linea;
                while((linea = br.readLine()) != null) {
                    System.out.println(linea); //muestra las lineas del archivo
                    bw.write(linea); //mientras que las escribe en la copia
                    bw.newLine();
                }
                System.out.println("Copia realizada.");
                br.close();
                bw.close();
        } catch (IOException e) {
            System.out.println("Error del archivo: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido.");
        }
    }
}
