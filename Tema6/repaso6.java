public class repaso6 {

    /*
     * Crea un array lineal de 10 elementos relleno de números aleatorios, y
     * muéstralo por pantalla. Ahora, pide al usuario un número y también la
     * posición en la que quiere insertarlo. Vuelve a mostrar el array con el número
     * del usuario insertado en la posición en la que ha indicado, y con todos los
     * números que había en esa posición y los siguientes, desplazados una posición
     * a la derecha (obviamente, se perderá el último dato, puesto que no puede
     * aumentarse el tamaño del array). Ejemplo:
     * 
     * Array generado: 7,3,5,7,8,2,4,9,0,1
     * Número a incluir: 2
     * Posición donde incluirlo: 7
     * Array modificado: 7,3,5,7,8,2,4,2,9,0
     */

    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*10);
        }

        System.out.println("Array generado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        int numU = Integer.parseInt(System.console().readLine("Número a incluir: "));
        int posicion = Integer.parseInt(System.console().readLine("Posición donde incluirlo: "));

        for (int i = numeros.length-1; i > posicion; i--) {
            numeros[i] = numeros[i-1]; // los muevo a la derecha
        }
        numeros[posicion] = numU;

        System.out.println();
        System.out.println("Array modificado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
