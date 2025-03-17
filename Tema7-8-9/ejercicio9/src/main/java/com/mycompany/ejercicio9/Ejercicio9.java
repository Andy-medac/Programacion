/*
 * Implementa la clase ‘TarjetaRegalo’ que tenga como atributos el nombre del cliente, un número de 5 cifras aleatorio 
y 20€ de saldo. Implementa los métodos habituales además del método gastar() y recargar().
 */
package com.mycompany.ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        TarjetaRegalo tarjeta1 = new TarjetaRegalo ("Juan");
        TarjetaRegalo tarjeta2 = new TarjetaRegalo ("Marina");
        TarjetaRegalo tarjeta3 = new TarjetaRegalo ("Paula");
        
        tarjeta1.gastar(18.5f);
        tarjeta2.recargar(59.23f);
        tarjeta3.recargar(9);
        
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);
        System.out.println(tarjeta3);
    }
}
