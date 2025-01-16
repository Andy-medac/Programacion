package com.mycompany.ejercicio12;

import java.util.Arrays;

//atributos
public class Vivienda {
    private String propietario;
    private int valor;
    private String direccion;
    private Habitacion[] habitaciones; //relacion de uno (vivienda) a muchos (habitaciones)
    
    //Constructor 
    public Vivienda(String p, int v, String d, Habitacion[] h){
        this.propietario = p;
        this.valor = v;
        this.direccion = d;
        this.habitaciones = h;
    }
      
    //Getters
    public String getPropietario(){
        return propietario;
    }

    public int getValor() {
        return valor;
    }

 
    public String getDireccion() {
        return direccion;
    }

    public Habitacion[] getHabitacion() {
        return this.habitaciones;
    }
    
       //Setters 
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHabitacion(Habitacion[] h) {
        this.habitaciones = h;
    }
    
    //toString 
    public String toString() {
        return "Vivienda{" + "propietario=" + this.propietario + ", valor=" + this.valor + ", direccion=" + this.direccion + ", habitaciones: " + Arrays.toString(this.habitaciones) + '}';
    }
    
    
    public void imprimirAreaH(){  //creamos una variable vacía para después en un bucle vayamos sumando 
        int mH = 0;                                //los metros de las habitaciones a través del método para obtener el total de metros de la vivienda
        for (int i = 0; i <this.habitaciones.length; i++) {
            mH += this.habitaciones[i].imprimirArea();
        }
        System.out.println("El área total de la vivienda es de " + mH + " m2.");
    }
}
