package com.mycompany.ejercicio5;

/*Planetas del sistema solar. Se necesita un programa que modele el concepto de planeta del sistema solar.
- Un planeta tiene los siguientes datos: nombre, num de satélites, diámetro, distancia al sol, tipo (gaseoso, 
terrestre, enano) y si es observable o no.

- Métodos habituales
- Main: crea 3 planetas del sistema solar, e imprímelos (junto con sus propiedades), por orden de más cercano al
sol a más lejano.
*/

public class Ejercicio5 {

    public static void main(String[] args) {

        Planeta planeta1 = new Planeta ("Júpiter", 4, 34755, 87374, "gaseoso", false);
        Planeta planeta2 = new Planeta ("Tierra", 1, 2633, 23849, "terrestre", true);
        Planeta planeta3 = new Planeta ("Plutón", 0, 198, 283740, "enano", false);
        
        System.out.println(planeta1);
        System.out.println(planeta2);
        System.out.println(planeta3);
    }
}
