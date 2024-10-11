public class Ejercicio29 {

    /*Progrma que calcula la media de varias notas, pero que de primeras no sabemos cuántas notas son,
     * Lo primero por lo tanto, es preguntar al usuario cuántas notas son, después preguntar las notas 
     * y por último calcular la media*/
    public static void main(String[] args) {
        
        int notas = Integer.parseInt(System.console().readLine("Cuántas notas son? "));
        int notafinal = 0;

        for (int i=0; i<notas; i++){
            
            int nota = Integer.parseInt(System.console().readLine("Introduce la nota " + i + " "));
            notafinal = notafinal + nota;
        }

        System.out.println("Tu nota media es de: " + notafinal/notas);
    }
}
