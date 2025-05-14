package com.mycompany.ejercicio5repaso;

public class Ejercicio5repaso {

     public static void main(String[] args) {
        
        Animal a1 = new Perro("Paco", 3, "Chiguagua");
        Animal a2 = new Perro("Coco", 1, "Yorshike");
        
        Animal a3 = new Gato("Wilson", 1, "negro");
        Animal a4 = new Gato("Amanda", 5, "blanco");
        
        Animal a5 = new Loro("Lorito", 3, true);
        Animal a6 = new Loro("Paquete", 1, false);
        
        Animal[] animales = {a1, a2, a3, a4, a5, a6};
        
        
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombre() + " " + animales[i].hacerSonido());  
            System.out.println(animales[i] instanceof Animal);
            }
        System.out.println("-------------------------");
        
        int contador = 0;
        
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].getEdad() >= 2) {
                contador ++;
            }
  
        }
        System.out.println(contador);
        
    }     
 }