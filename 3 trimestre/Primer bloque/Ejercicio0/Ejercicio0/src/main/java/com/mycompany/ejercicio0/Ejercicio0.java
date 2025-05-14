package com.mycompany.ejercicio0;

import java.util.Scanner;

public class Ejercicio0 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        try {
            int num1 = Integer.parseInt(sc.nextLine());
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.println(num1/num2);
            
        } catch (NumberFormatException e) { // si no introduce int
            System.out.println("Error, introduce un numero.");
            
        } catch (ArithmeticException ari){ // si divide entre 0
            System.out.println("Error, no se puede dividir entre 0.");
            
        } catch (Exception gen){ // error en general
            System.out.println("Error");
            
        } finally { // Esto se imprime si o si
            System.out.println("Bye bye");
        }
    }
}
