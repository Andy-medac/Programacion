public class repaso3 {

    /*
     * Desarrolla una versión simplificada del ahorcado, en la que siempre se jugará
     * con la misma palabra. Elige una palabra y crea un array guardando en cada
     * posición una letra de la palabra.
     * Tu programa debe mostrar por consola un símbolo '_' por cada letra, y pedir
     * al usuario que introduzca una letra. Si dicha letra está en la palabra, la
     * mostrará (sustituirá el '_' por la letra). El programa repetirá la pregunta
     * hasta que el usuario averigüe la palabra al completo, momento en el que le
     * dará la enhorabuena y finalizará el programa.
     */

    public static void main(String[] args) {

        String palabra[] = { "c", "a", "s", "a" };

        String barras[] = { "_", "_", "_", "_" };

        int contador = 0;

        do {
            for (int i = 0; i < barras.length; i++) {
                System.out.print(barras[i]); // muestro la palabra sin solucionar
            }

            System.out.println();
            System.out.println();
            String letra = System.console().readLine("Introduce una letra: "); // le pregunto al usuario una letra

            for (int i = 0; i < barras.length; i++) {
                if (letra.equals(palabra[i])) {
                    System.out.println("Acertaste la " + (i+1) + " letra!");
                    barras[i] = letra;
                    contador++;
                }

            }
        } while (contador != palabra.length);

        System.out.println();

        for (int i = 0; i < barras.length; i++) {
            System.out.print(barras[i]);
        }
        System.out.println();
        System.out.println("Enhorabuena, adivinaste la palabra!");

    }
}
