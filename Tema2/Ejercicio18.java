/*Una tienda tiene una oferta que consiste en hacer un 10% de 
descuento a quienes compren 5 artículos. Para calcular el precio total a pagar 
te piden que desarrolles un programa que pregunte primero, uno a uno, 
el precio de los 5 artículos, y después muestre el precio total tras sumar los 5 y aplicar el descuento. */

public class Ejercicio18 {
    public static void main(String[] args) {
        
        float precio1 = Float.parseFloat(System.console().readLine("Introduce el precio del primer artúculo: "));
        float precio2 = Float.parseFloat(System.console().readLine("Introduce el precio del segundo artúculo: "));
        float precio3 = Float.parseFloat(System.console().readLine("Introduce el precio del tercero artúculo: "));
        float precio4 = Float.parseFloat(System.console().readLine("Introduce el precio del cuarto artúculo: "));
        float precio5 = Float.parseFloat(System.console().readLine("Introduce el precio del quinto artúculo: "));

        float precioSinDescuento = precio1 + precio2 + precio3 + precio4 + precio5;
        final float descuento = 10;
        float descuentoFinal = (precioSinDescuento*descuento)/100;
        float precio = precioSinDescuento - descuentoFinal;

        System.out.println("El precio final con descuento es de: " + precio + " euros.");

    }
}
