public class Ejercicio8b {

    /*
     * Programa que rellene un array de 20 posiciones con números aleatorios entre
     * el 0 y el 100
     * El programa debe imprimir los números del array
     * Versión 2: debe mostrar los números de mayor a menor
     */

    public static void main(String[] args) {

        //Creamos arrays vacíos
        int numeros[] = new int[5];
        int numOrdenados[] = new int[5];

        //Relleno el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 9);
        }

        //Muestro el array desordenado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        /////////////////////////////////////////////////////ORDENAR EL ARRAY//////////////////////////////////////////////////////////
        
        int mayor = 0;
        int posicion = 0;
        
        //Buscamos el mayor
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numOrdenados.length; j++) {
                if (numeros[j] > mayor) {
                    mayor = numeros[j]; //nos guardamos el mayor
                    posicion = j; //nos guardamos la posición del mayor
                }
            }

            numOrdenados[i] = mayor; //Guardo el mayor en la primera posición del array ordenado
            numeros[posicion] = 0; //Borro ese número del array desordenado
            mayor = 0;  //volvemos a mayor 0 para que no siga siendo el mayor de antes
        }

        System.out.println("Numeros ordenados:");

        for (int i = 0; i < numOrdenados.length; i++) {
            System.out.println(numOrdenados[i]);
        }
    }

}
