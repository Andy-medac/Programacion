/*  Desarrolla un programa que calcule el IMC de una persona (índice de masa corporal) tras preguntarle su peso y su altura.*/

public class Ejercicio16 {
   
    public static void main(String[] args) {
        
        float peso = Float.parseFloat(System.console().readLine("Introduce tu peso en kg:"));
        float altura = Float.parseFloat(System.console().readLine("Introduce tu altura en m:"));

        float IMC = peso/altura;

        System.out.println("Tu IMC es de: " + IMC );
    }
}
