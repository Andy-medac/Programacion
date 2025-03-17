package com.mycompany.ejercicio6;

/**
Crea la clase Fracción. Los atributos serán numerador y denominador. Debe tener métodos 
para ver el numerador, ver el denominador, ver el resultado de dividirlos y un último método 
que indique si la división es exacta o no.
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        
        Fraccion fraccion1 = new Fraccion (16f, 2f);
        Fraccion fraccion2 = new Fraccion (23f, 2f);
        
        System.out.println(fraccion1);
        System.out.println(fraccion2);
        
        fraccion1.imprimirDenominador();
        fraccion2.imprimirNumerador();
        
        fraccion1.exacto();
        fraccion2.exacto();
    }
}
