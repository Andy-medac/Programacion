public class EJercicio7 {
    /*
     * Desarrolla un programa que pida la edad al usuario y la mande a un método.
     * EL método comprobará si es mayor de edad o no, y devolverá al main una frase
     * que será "es mayor de edad" o "es menor de edad."
     * 
     * El main imprimirá el resultado.
     */

    // LE DEVUELVES AL MAIN UN STRING, MIENTRAS QUE RECIBE UN INT
    public static String edadU(int n1) {

        String frase = "";
        if (n1 < 18) {
            frase = "Es menor de edad";
        } 
        
        else {
            frase = "Es mayor de edad";
        }

        return frase;

    }

    public static void main(String[] args) {

        int edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));
        System.out.println(edadU(edad));
        ;
    }
}
