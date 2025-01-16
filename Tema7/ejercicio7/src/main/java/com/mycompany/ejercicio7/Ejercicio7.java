package com.mycompany.ejercicio7;

/**
Implementa la clase ‘cuadrado’, con atributos lado y caracterDibujo. Implementa los métodos 
* estándar y además, el método dibujar cuadrado (que dibujará un cuadrado por consola en
* función del lado y usando el caracter que se haya establecido en caracterDibujo). Es decir, si 
* en el main creamos un cuadrado con lado 5 y caracterDibujo un '*', y llamamos al método
* dibujarCuadrado(), deberá verse por consola un cuadrado de 5x5 pintado con asteriscos.
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Cuadrado cuadrado1 = new Cuadrado (5, "*");
        
        System.out.println(cuadrado1);
        
        cuadrado1.dibujarCuadrado();
        cuadrado1.imprimirCaracter();
        cuadrado1.imprimirLado();
    }
}
