package com.mycompany.ejercicio1;

public class Autobus extends Vehiculo {
        private int plantas;
    
    public Autobus (String marca, String modelo, String matricula, int km, int precio, int plantas, int descuento){
        super(marca, modelo, matricula, km, precio, descuento);
        this.plantas = plantas; 
    }
}

