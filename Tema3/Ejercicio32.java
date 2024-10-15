public class Ejercicio32 {
    /*Programa que pinta por consola un cuadro de asteriscos de lado n
     * (n lo introduce el usuario)
    */
    public static void main(String[] args) {
        
        int n = Integer.parseInt(System.console().readLine("Introduce el largo o ancho del lado: "));

        for (int i = 0; i<n; i++){
        
            for (int j = 0; j<n-1; j++){
                System.out.print("* ");
            }

            System.out.println("*");
        }
    }
}
