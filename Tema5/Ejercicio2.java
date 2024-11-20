public class Ejercicio2 {

    /* Dado un número que se le pasa por parámetro a un método,
     * este de forma recursiva suma todos los números inferiores a él
     * (hasta el 0)
    */

    public static int suma (int n){

        if (n<=0) {
            return 0;
        }
        
        return (n) + suma(n-1);

        }

    public static void main(String[] args) {
        
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        System.out.println(suma(numU));
    }
}
