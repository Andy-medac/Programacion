public class Ejercicio2 {

    /*Desarrolla un programa que pida un número al usuario e imprima hola el número de veces que haya dicho
     * en el main se le pide el número y se le pasa el método
     * el método imprime hola las veces que se le hayan especificado
     */

     public static void repeticiones (int numero){
        for(int i = 0; i<numero; i++){
            System.out.println("hola");
        }
     }
    public static void main(String[] args) {
        int veces = Integer.parseInt(System.console().readLine("Introduce un numero: "));
        repeticiones(veces);
    }
}
