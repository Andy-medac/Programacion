/*Programa que te pide el precio y le añade el IVA (lo multiplica por 1,21) */

public class Ejercicio10 {

    public static void main(String[] args) {

        float precio = Float.parseFloat(System.console().readLine("Introduce el precio del producto: "));

        final float iva = 1.21f;
        float precioIva = precio * iva;

        System.out.println("El precio final con IVA es de " + precioIva);

    }
}
