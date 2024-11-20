public class repaso1 {

    /*
     * Desarrolla un programa que pida al usuario que introduzca 10 números enteros.
     * Una vez introducidos todos, el programa debe mostrarlos por consola ordenados
     * de menor a mayor.
     */

    public static void main(String[] args) {

        int numeros[] = new int[10];
        int numOrdenados[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine("Introduce un número: "));
        }

        int mayor = 0;
        int posicion = 0;

        for (int i = numeros.length - 1; i >= 0; i--) {

            for (int j = 0; j < numOrdenados.length; j++) {
                if (numeros[j] > mayor) {
                    mayor = numeros[j]; // nos guardamos el mayor
                    posicion = j; // nos guardamos la posición del mayor
                }
            }

            

            numOrdenados[i] = mayor; // Guardo el mayor en la última posición del array ordenado
            numeros[posicion] = 0; // Borro ese número del array desordenado
            mayor = 0; // volvemos a mayor 0 para que no siga siendo el mayor de antes
        }

        System.out.println("Números ordenados:");

        for (int i = 0; i < numOrdenados.length; i++) { //aquí también se puede poner que muestre el array del revés directamente
            System.out.println(numOrdenados[i]);
        }
    }
}
