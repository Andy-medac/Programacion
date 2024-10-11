

public class Ejercicio30 {

    /*Algoritmo que pida numeros (Se pedirá por consola la cantidad de números a introducir)
         * El programa, al finalizar debe informar cuántos numeros son mayores que 100,
         * cuantos menores de 100 y cuántos iguales a 100.
         */

    public static void main(String[] args) {
        
        int numeros = Integer.parseInt(System.console().readLine("Cuántos números son? "));

        //Todos las variables que podamos crear fuera del bucle, mejor.
        int numero = 0;
        int mayor = 0;
        int menor = 0;
        int igual = 0;

        for (int i=0; i<numeros; i++){

            numero = Integer.parseInt(System.console().readLine("Introduce el número " + (i+1) + " "));

            if (numero>100) {
                mayor += 1;
            }

            else if (numero<100){
                menor += 1;
            }

            else if (numero==100) {
                igual += 1;
            }
        }

        System.out.println("Números mayores que 100 = " + mayor + "  Números menores que 100 = " + menor + "  Números iguales a 100 = " + igual);
    }
}
