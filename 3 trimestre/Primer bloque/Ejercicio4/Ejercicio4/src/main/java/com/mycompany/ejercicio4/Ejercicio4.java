package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5]; 
        double suma = 0;
        System.out.println("Introduce 5 notas (de 0 a 10):");

        for (int i = 0; i < notas.length; i++) { 
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i]; 
        }

        double media = suma / notas.length; 

        System.out.println("La media es: " + media);
    }
}
