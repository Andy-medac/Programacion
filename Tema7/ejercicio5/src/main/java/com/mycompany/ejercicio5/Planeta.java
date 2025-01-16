
package com.mycompany.ejercicio5;

//Atributos
public class Planeta {
    
    private String nombre;
    private int satelites;
    private int diametro;
    private int distancia;
    private String tipo;
    private boolean observable;
    
    //Constructores

    public Planeta(String n, int s, int dia, int dis, String t, boolean o){
        this.nombre = n;
        this.satelites = s;
        this.diametro = dia;
        this.distancia = dis;
        this.tipo = t;
        this.observable = o;
    }
    
    //Getters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getSatelites(){
        return this.satelites;
    }
    
    public int getDiametro(){
        return this.diametro;
    }
    
    public int getDistancia(){
        return this.distancia;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public boolean getObservable(){
        return this.observable;
    }
    
    //Setters
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setSatelites(int s){
        this.satelites = s;
    }
    
    public void setDiametro(int dia){
        this.diametro = dia;
    }
    
    public void setDistancia(int dis){
        this.distancia = dis;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void setObservable(boolean o){
        this.observable = o;
    }
    
    public String toString(){  //NO HAY QUE LLAMAR A ESTE MÉTODO EN EL MAIN, CUANDO LLAMEMOS A UN PLANETA SE EJECUTA ESTE
        if (this.observable == true) {
                    return "Planeta { nombre:" + this.nombre + "/ número de satélites: " + this.satelites + "/ diámetro: " + this.diametro + "/ distancia al sol: " + this.distancia + "/ tipo: " + this.tipo + "/ observable: si}";

        }
        else{
                    return "Planeta { nombre:" + this.nombre + "/ número de satélites: " + this.satelites + "/ diámetro: " + this.diametro + "/ distancia al sol: " + this.distancia + "/ tipo: " + this.tipo + "/ observable: no}";

        }
    }
}

