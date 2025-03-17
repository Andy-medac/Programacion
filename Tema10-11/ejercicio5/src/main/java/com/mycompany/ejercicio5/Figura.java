package com.mycompany.ejercicio5;

/**
Crea una clase Figura genérica que cuente con un método calcularArea(). 
* Luego, crea 3 subclases de 3 figuras geométricas concretas, las que tú quieras 
* (triángulo, cuadrado, rectángulo, círculo... las que quieras) que deben sobreescribir 
* el método para calcular su área correspondiente. Para este ejercicio, es necesario
* investigar primero qué es la sobreescritura y qué significa la palabra @Override 
* (punto 6 del tema 10), porque el método calcularArea() lo vamos a poner en la 
* superclase pero se debe modificar en las subclases.
 */

public abstract class Figura { // quiero que sea abstracta para que no se puedan crear objetos Figura
    
    //metodo abstracto para obligar a todas las clases hijas a tener este método
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
}
