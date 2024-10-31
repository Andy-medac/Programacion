/* Desarrolla un programa que pida al usuario que introduzca la cantidad 
de litros de gasolina que caben en el depósito de su coche, y 
la cantidad de kilómetros que ha recorrido. Luego, calcula e 
imprime el consumo medio en litros por cada 100 km.*/

public class Ejercicio17 {
    public static void main(String[] args) {
        
        float deposito = Float.parseFloat(System.console().readLine("Introduce la capacidad del depósito en litros: "));

        float kilometros = Float.parseFloat (System.console().readLine("Introduce los km recorridos: "));

        final int recorrido = 100;
        float consumoMedio = (deposito*recorrido)/kilometros;

        System.out.println("El consumo medio cada 100km es de " + consumoMedio + " litros.");
    }
}
