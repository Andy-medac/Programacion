package com.mycompany.ejercicio1;

/**
 *
 * @author PC221
 */
// Clase para crear el tipo de dato coche
public class Coche {

    //ATRIBUTOS 
    //(variables que definen los datos de una clase)
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int km;
    
    //Método para poder crear los coches
    //CONSTRUCTOR
    public Coche (String matri, String marc, String model, String col, int kmo) {
        
        //Relacionamos las variables con los parámetros que va a recibir
        this.matricula = matri;
        this.marca = marc;
        this.modelo = model;
        this.color = col;
        this.km = kmo;
        
    }
    
    public void mostrar (){
        System.out.println("El coche con matricula " + this.matricula + " tiene " + this.km + " km.");
    }
}
