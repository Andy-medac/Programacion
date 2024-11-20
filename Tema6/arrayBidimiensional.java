public class arrayBidimiensional {
    

    /* ARRAY BIDIMENSIONAL
     * TABLAS BIDIMENSIONALES
     * MATRICES
     */
    public static void main(String[] args) {
        
        int numeros[] = {5, 3, 8, 7};
        String palabra[] = {"hola", "adios"};

        // OPCIÓN 1: CREARLA LLENA (todos deben tener la misma cantidad de datos y ser del mismo tipo)
        int numerosMatrizA[][] = {
            {4, 3, 6},
            {1, 8, 7},
            {9, 3, 2},
            {2, 4, 8},
            {1, 5, 7}
        };

        // OPCIOÓN 2: ASIGNARLE VALORES
        int numerosMatrizB[][] = new int[5][3];
        numerosMatrizB[2][1] = 6;

        //IMPRIMIR UNA MATRIZ POR CONSOLA
        for (int i = 0; i < numerosMatrizA.length; i++) {

            for (int j = 0; j < numerosMatrizA[0].length; j++) {
                System.out.print(numerosMatrizA[i][j]);
            }

            System.out.print(" ");

        }
    }
}
