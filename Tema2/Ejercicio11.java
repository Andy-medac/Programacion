/* Desarrolla un conversor de bits a Bytes*/

public class Ejercicio11 {
    public static void main(String[] args) {
        

        int bits = Integer.parseInt(System.console().readLine("Indique la cantidad de bits a convertir:"));

        int bytes = bits/8;

        System.out.println( bits + " bits son " + bytes + " bytes.");
    }
}
