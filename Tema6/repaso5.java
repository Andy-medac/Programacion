public class repaso5 {

    /*
     * Realiza un programa que muestre por pantalla un array de 10 filas por 10
     * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
     * programa debe mostrar por pantalla solo los números de la diagonal que va
     * desde la esquina superior izquierda a la esquina inferior derecha, así como
     * el máximo, el mínimo y la media de los números que hay en esa diagonal.
     */

    public static void main(String[] args) {

        int numeros[][] = new int[10][10];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int)(Math.random()*100+200);
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int diagonal[] = new int[10];
        System.out.print("Diagonal: ");
        for (int i = 0; i < numeros.length; i++) {
            diagonal[i] = numeros[i][i];
            System.out.print(diagonal[i] + " ");
        }

        System.out.println();
        int mayor = 0;
        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] > mayor) {
                mayor = diagonal[i];
            }
        }
        System.out.println("El mayor es " + mayor);
        
        int menor = 300;
        for (int i = 0; i < diagonal.length; i++) {
            if (diagonal[i] < menor) {
                menor = diagonal[i];
            }
        }
        System.out.println("El menor es " + menor);

        int suma = 0;
        
        for (int i = 0; i < diagonal.length; i++) {
            suma += diagonal[i]; 
        }
        int media = suma/diagonal.length;
        System.out.println("La media es " + media);
    }
}
