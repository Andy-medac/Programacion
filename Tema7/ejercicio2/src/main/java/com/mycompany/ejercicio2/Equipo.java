package com.mycompany.ejercicio2;

public class Equipo {
     //Creamos los atributos
    private String ciudad;
    private int numSocio;
    private int preAnual;
    
    //Creamos el constructor
    public Equipo(String c, int s, int a) {

    this.ciudad = c;
    this.numSocio = s;
    this.preAnual = a;

    }
    
    //Creamos los getters
    public String getCiudad (){
        return this.ciudad;
    }
    public int getNumSocio (){
        return this.numSocio;
    }
    public int getPreAnual (){
        return this.preAnual;
    }
    
    //Creamos los setters
    public void setCiudad(String c){
        this.ciudad = c;
    }
    public void setNumSocio(int s){
        this.numSocio = s;
    }
    public void setPreAnual(int a){
        this.preAnual = a;
    }
    
    //Método para imprimir
    public void imprimirEquipos(){
        System.out.println("El equipo es: " + this.ciudad + 
                ", tiene este numero de socio " + this.numSocio + " con este presupuesto " + this.preAnual);
    }
}
