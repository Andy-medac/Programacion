package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int num = 0;
        float suma = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número de alumnos: ");

        try {
            num = Integer.parseInt(sc.nextLine()); 
            
        } catch (NumberFormatException e) {
            System.out.println("Error, introduce un número.");
            
        } catch (Exception e){ //IMPORTANTE PONER ESTO SIEMPRE
            System.out.println("Error desconocido");
            
        } finally {
            System.out.println("Registro completado.");
            
        }

        float alumnos[] = new float[num];

        for (int i = 0; i < alumnos.length; i++) {
            try {
                alumnos[i] = Float.parseFloat(System.console().readLine("Introduce la nota del alumno: "));
                if (alumnos[i] <  0 || alumnos[i] > 10) {
                    throw new NotaInvalidaException("La nota debe estar entre el 0 y el 10");
                }
                suma += alumnos[i];
                
            } catch (NumberFormatException e) {
                System.out.println("Error, introduce un número.");
                i--;
                
            } catch (NotaInvalidaException e){
                System.out.println("Error: " + e.getMessage());
                i--;
            } finally {
                System.out.println("Registro completado.");
            }
        }
        
        float media = suma/num;
        System.out.println("La media es de " + media);
    }
}
