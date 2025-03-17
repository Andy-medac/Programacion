package com.mycompany.ejercicio1;

public class Vehiculo {
       
    private String marca;
    private String modelo;
    private String matricula;
    private int km;
    private int precio;
    private int descuento;

    public Vehiculo(String marca, String modelo, String matricula, int km, int precio, int descuento) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.km = km;
        this.precio = precio;
        this.descuento= descuento;
    }

    public int getPrecio() {
        return this.precio;
    }
    
    public int getDescuento(){
        return this.descuento;
    }

     public void precioFinal (){
        System.out.println("Precio final: " + (this.precio-this.descuento));
     }
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", km=" + km + '}';
    }
}
