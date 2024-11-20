public class Ejercicio5 {

    /*
     * Programa que muestre por pantalla un array de 10 números enteros
     * generados al azar entre 0 y 100.
     * 
     * El programa le pide al usuario un número.
     * 
     * Debe comprobar si el número introducido por teclado se encuentra dentro de la
     * array.
     */
    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 101);
        }

        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        int encontrado = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == numU) {
                encontrado = 1;
                break;
            }
        }

        if (encontrado == 1 ) {
            System.out.println("Lo encontraste");
        }

        else {
            System.out.println("No está");
        }

    }
}
