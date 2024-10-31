/* Programa que pide al usuario el número de trozos en los que está 
divida una tarta, y cuántas personas van a comer, e indica a cuántos 
trozos toca cada uno y cuántos sobran */

public class Ejercicio9 {
    public static void main(String[] args) {
        
        int tarta = Integer.parseInt(System.console().readLine("¿En cuántos trozos está dividida la tarta?"));
        int personas = Integer.parseInt(System.console().readLine("¿Cuántas personas van a comer?"));

        int resultado = tarta / personas;
        int sobrante = tarta%personas; 

        System.out.println("Cada persona tendrá " + resultado + " trozos y sobrarán " + sobrante + " trozos.");

    }
}
