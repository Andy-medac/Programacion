package com.mycompany.ejercicio1;

public class Coche extends Vehiculo {
    
    //Añadimos los atributos que son especiales para esta clase ya que los otros ya los hereda con el extends
    private int puertas;
    private int decuento;
    
    public Coche(String marca, String modelo, String matricula, int km, int puertas, int descuento, int precio){ //al hacer el constructor ponemos todos los atributos heredados y los suyos
        super(marca, modelo, matricula, km, precio, descuento); // con el método super llamo al constructor de la clase padre y en los () indico los atributos
        this.puertas = puertas;
    }
    
    
}
