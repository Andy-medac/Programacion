public class Ejercicio10 {
    /*Programa quwe le pida al usuario una frase y muestra
     * - cuantos caracteres tiene
     * - cuantas palabras tiene 
     */
    public static void main(String[] args) {
        
        String palabra = System.console().readLine("Introduce una frase: ");

        System.out.println("Tiene " + palabra.length() + " caracteres.");

        String fraseDividida[] = palabra.split(" ");
        System.out.println("Tiene " + fraseDividida.length + " palabras.");
    }
}
