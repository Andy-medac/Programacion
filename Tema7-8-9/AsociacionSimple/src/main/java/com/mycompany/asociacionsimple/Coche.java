package com.mycompany.asociacionsimple;

public class Coche {
    
    //Atributos
    private Persona propietario;
    private String marca;
    private int km;
    
    //Constructor
    public Coche(Persona p, String m, int k){
        this.propietario = p;
        this.marca = m;
        this.km = k;
    }
    
    public String toString (){
        return "Propietario: " + this.propietario.getNombre() + " / marca: " + this.marca + " / km: " + this.km;
    }
}
