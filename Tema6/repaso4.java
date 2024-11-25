public class repaso4 {

    /*
     * Desarrolla un programa que permita comprobar si una palabra o frase es
     * palíndroma, así como si un número es capicúa (significa que una palabra o
     * número se lea igual en ambas direcciones, como la palabra "somos" o el número
     * "13731"). El programa pedirá una entrada al usuario (pueden ser palabras,
     * frases o números) y mostrará por consola si es o no palíndroma/capicúa.
     */

    public static void main(String[] args) {

        String usuario = System.console().readLine("Introduce un número o frase para comprobar si es capicúa o polindroma: ");
        char comprobacion[] = usuario.toCharArray();
        char invertida[] = new char[comprobacion.length];

        for (int i = 0; i < invertida.length; i++) {
            invertida[i] = comprobacion[comprobacion.length-1-i];
        }

        for (int i = 0; i < invertida.length; i++) {
            System.out.print(invertida[i]);
        }

        System.out.println();

        int errores = 0;
        for (int i = 0; i < comprobacion.length; i++) {
            if (comprobacion[i] != invertida[i]) {
                errores++;
                break; // Si hay un error, no es capicúa/palíndroma
            }
        }

            if (errores == 0) {
                System.out.println("Es capicúa/políndroma");
            }

            else {
                System.out.println("No es capicúa/políndroma");
            }
    }
}
