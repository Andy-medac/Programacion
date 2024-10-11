public class Ejercicio27 {
    /*Un bucle pretende imprimir todos los números del 0 al 100.
     * Se interrumpe en el número que diga el usuario
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = 0; i<100; i++) {
            
            System.out.print(" " + i + " ");

            if (i==numero) {
                break;
            }
        
        }
    }
}
