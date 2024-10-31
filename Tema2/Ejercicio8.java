/* Programa que convierte euros a dólares */

public class Ejercicio8 {
    public static void main(String[] args) {
         
        float euros = Float.parseFloat (System.console().readLine("Introduce el número de euros:"));
        
        float conversion = euros*1.11f;

        System.out.println(euros + " euros son " + conversion + " dólares.");
    }
}
