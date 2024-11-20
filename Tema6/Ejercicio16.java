public class Ejercicio16 {

    /*
     * Programa que crea un array de 5x5 en las que todas las posiciones sean 0
     * 
     * Después haz que en una posicion aleatoria del array se coloque un 1. Muestra
     * la matriz por consola.
     * Mostrar el array por consola con el 1 incluido
     */

    public static void main(String[] args) {

        /*int ceros[][] = {  ---> ESTA ES LA OTRA MANERA DE HACERLO
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };*/

        int ceros[][] = new int[5][5];

        for (int i = 0; i < ceros.length; i++) {
            for (int j = 0; j < ceros[0].length; j++) {
                ceros[i][j] = 0;
            }
        }
        
        for (int i = 0; i < ceros.length; i++) {
            for (int j = 0; j < ceros[0].length; j++) {
                System.out.print(ceros[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int posicionA = (int) (Math.random() * ceros.length);
        int posicionB = (int) (Math.random() * ceros[0].length);
        int num = 1;
        ceros[posicionA][posicionB] = num;

        //ceros.length me dice cuantas filas tiene la matriz
        //ceros[0].length me dice cuántas columnas tiene la matriz
        
        for (int i = 0; i < ceros.length; i++) {
            for (int j = 0; j < ceros[0].length; j++) {
                System.out.print(ceros[j][i]);
            }
            System.out.println();
        }

    }

}
