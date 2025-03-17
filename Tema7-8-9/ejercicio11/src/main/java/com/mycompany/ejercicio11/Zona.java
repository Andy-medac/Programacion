package com.mycompany.ejercicio11;

public class Zona {
    private Persona responsable;
    private int metros;
    private int presupuesto;
    private boolean publico;
    private Animal[] animales;
    
    //Constructor 
    public Zona (Persona r, int m, int p, boolean pu, Animal[] a){
        this.responsable = r;
        this.metros = m;
        this.presupuesto = p;
        this.publico = pu;
        this.animales = a;
    }
    
    //Getters
    
    public Persona getPersona (){
        return this.responsable;
    }
    
    public int getMetros(){
        return this.metros;
    }
    
    public int getPresupuesto(){
        return this.presupuesto;
    }
    
    public boolean getPublico(){
        return this.publico;
    }
    
    public Animal[] getAnimal(){
        return this.animales;
    }
    
    //Setters
    
    public void setPersona(Persona r){
        this.responsable = r;
    }
    
    public void setMetros (int m){
        this.metros = m;
    }
    
    public void setPresupuesto (int p){
        this.presupuesto = p;
    }
    
    public void setPublico (boolean pu){
        this.publico = pu;
    }
    
    public void setAnimales (Animal[] a){
        this.animales = a;
    }
    
    //Métodos
    public String toString(){
        
        if (this.publico == true) {
            return "Persona encargada: " + this.responsable.getNombre() + "/ metros: " + this.metros + "/ presupuesto: " + this.presupuesto + "/ abierto al publico:  si  " + "/ animales: ";
        }
        else{
            return "Persona encargada: " + this.responsable.getNombre() + "/ metros: " + this.metros + "/ presupuesto: " + this.presupuesto + "/ abierto al publico:  no  " + "/ animales: ";
            
        }
    }
    
    public void imprimirAnimales(){
         for (int i = 0; i < animales.length; i++) {
            System.out.println(this.animales[i].getNombre());
        }
    }
    
}
