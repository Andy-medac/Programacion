public class Ejercicio20 {

    /*Desarrolla un programa que pregunte al usuario un número por consola
     * la tabla de multiplicar de ese número
     */
    public static void main(String[] args) {
        //Pido un número y lo convierto en variable
        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));
        
        //Hago un bucle de 11 veces (del 0 al 10) de la multiplicación del número de veces que se repite por el número que introducimos
        for (int i = 0; i<11; i++) {
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
