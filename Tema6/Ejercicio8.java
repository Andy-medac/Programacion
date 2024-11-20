public class Ejercicio8 {

    /* Programa que rellene un array de 20 posiciones con números aleatorios entre el 0 y el 100
     * El programa debe imprimir los números del array
     * Versión 1: debe mostrar por pantalla el número mayor de todos los que tiene el array
    */

    public static void main(String[] args) {
        
        int numeros[] = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        System.out.println("El mayor es " + mayor);
    }
}
