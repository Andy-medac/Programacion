package com.mycompany.ejercicio9;

//Atributos
public class TarjetaRegalo {
    
    private String nombre;
    private String numero;
    private float saldo;

//Constructor
    public TarjetaRegalo (String n){
        this.nombre = n;
        this.numero ="" + (int) (Math.random()*10) + (int) (Math.random()*10) + (int) (Math.random()*10) + (int) (Math.random()*10) + (int) (Math.random()*10);
        this.saldo = 20.0f;
    }
    
    //Getters
    public String getNombre() {
        return this.nombre;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    //Setters
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setNumero(String num) {
        this.numero = num;
    }
    
    public void setSaldo (int s){
        this.saldo = s;
    }
    
    //ToString
    
    public String toString (){
        return "Nombre: " + this.nombre + " / numero de tarjeta: " + this.numero + " / saldo: " + this.saldo;
    }

     //Metodos
       public void gastar(float dinero){
           this.saldo -= dinero;
       }
       
       public void recargar (float dinero){
           this.saldo += dinero;
       }
}