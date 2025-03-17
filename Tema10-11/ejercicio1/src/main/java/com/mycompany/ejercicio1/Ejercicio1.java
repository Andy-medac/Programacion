package com.mycompany.ejercicio1;

/**
CConcesionario de coches, motos, camiones y autobuses
* 
* Cuando las clases son muy parecidas en cuanto a código, se crea una clase padre que se usará como 
* referencia al código que deberán tener esas clases, para no tener que repetir todo
* 
* Palabras reservadas en herencia
* extends
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("nissan", "gtr", "2344ASD", 2374, 3, 300, 50000);
        
        coche1.precioFinal();
    }
}
