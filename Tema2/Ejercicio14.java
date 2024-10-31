/* Conversor de kelvin a celsius */

public class Ejercicio14 {
   
    public static void main(String[] args) {
        
        float celsius = Float.parseFloat(System.console().readLine("Introduce el número de grados ºC a convertir:"));

        float resultado = celsius + 273.15f;

        System.out.println("La equivalencia en celsius es " + resultado + " kelvin.");

    }
}
