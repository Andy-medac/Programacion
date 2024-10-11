public class Ejercicio29 {

    /*Programa que calcula la media de varias notas, pero que de primeras no sabemos cuántas notas son,
     * Lo primero por lo tanto, es preguntar al usuario cuántas notas son, después preguntar las notas 
     * y por último calcular la media*/
    public static void main(String[] args) {
        
        int notas = Integer.parseInt(System.console().readLine("Cuántas notas son? "));
        float notafinal = 0f;

        for (int i=0; i<notas; i++){
            
            notafinal =  notafinal + Float.parseFloat(System.console().readLine("Introduce la nota " + i+1 + " "));
        //  notaFinal += Float.parseFloat ... para no tener que escribir notaFinal dos veces, se puede escribir así
        //Lula mírate del tema 2 de programación, la tablita del apartado 9.4, que así lo entiendes mejor
        }

        //es necesario que todos los números que divida sean del mismo tipo de variable
        float media = notafinal/(float)notas;
        System.out.println("Tu nota media es de: " + media);
    }
}
