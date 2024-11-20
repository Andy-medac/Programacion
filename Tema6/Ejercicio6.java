public class Ejercicio6 {
    
/*Programa que pregunte al usuario 10 números enteros por consola
 * y que luego los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa
 */

    public static void main(String[] args) {
        
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine("Introduce un número " + i + ": "));
        }

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}
