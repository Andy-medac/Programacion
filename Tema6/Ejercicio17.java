public class Ejercicio17 {

    /*
     * Crea un array en forma de matriz de 10x10 que represente (de forma
     * simplificada) una imagen
     * Supongamos que los píxeles sólo pudieran ser:
     * - rojos 1
     * - verdes 2
     * - azules 3
     * 
     * Para simular la imagen, haz que se rellene aleatoriamente con estos valores.
     * Muestra por pantalla la imagen en forma de matriz
     * 
     * Cuando de aplica un filtro a la imagen, lo que se hace realmente es modificar
     * los valores
     * de cada pixel dentro de la matriz. Supongamos que un filtro que consiste en
     * eliminar los
     * tonos rojos para crear una imagen con efecto azulado. Haz que el programa
     * sustituya todos los rojos (1) por
     * azules (3). Vuelve a mostrar la matriz para ver cómo ha quedado.
     */
    public static void main(String[] args) {

        int imagen[][] = new int[10][10];
        System.out.println("Imagen normal: ");

        //relleno la matriz con números aleatorios del 1 al 3
        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen[0].length; j++) {
                imagen[i][j] = (int) (Math.random() * 3 + 1);
            }
        }

        //Muestro la matriz
        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen[0].length; j++) {
                System.out.print(imagen[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Cambio de filtro:");

        //Si en una de las casillas hay un 1, las sustituyo por un 3 (como si aplicáramos un filtro)
        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen[0].length; j++) {
                if (imagen[i][j] == 1) {
                    imagen[i][j] = 3;
                }
            }
        }

        // Vuelvo a mostrar la matriz cambiada
        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen[0].length; j++) {
                System.out.print(imagen[i][j] + " ");
            }
            System.out.println();
        }

    }
}
