public class Ejercicio14 {
/*Programa que genere un array de 5x5 relleno de números enteros aleatorios entre el 0 y el 99 */
    public static void main(String[] args) {
        
        int numeros[][] = new int[5][5];

        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int) (Math.random()*100);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

    }
}