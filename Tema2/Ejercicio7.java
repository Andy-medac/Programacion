/* Programa que calcula el perímetro de y el área de un rectángulo cuando el usuario le haya dicho los 2 lados */



public class Ejercicio7 {
    public static void main(String[] args) {
        
        float altura = Float.parseFloat (System.console().readLine("Introduzca la altura del rectángulo en cm:"));
        float base = Float.parseFloat (System.console().readLine("Introduzca la base del rectángulo en cm:"));

        float resultado = altura*base;

        System.out.println("El perímetro es de " + resultado + " cm.");
    }
}
