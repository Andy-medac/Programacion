package com.mycompany.ejercicio4;

public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;
  
    
    //Constructor
    public Persona(String n, int e, String g, String na){
        this.nombre = n;
        this.edad = e;
        this.genero = g;
        this.nacionalidad = na;
    }
    
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    //Setters
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setEdad (int e){
        this.edad = e;
    }
    
    public void setGenero (String g){
        this.genero = g;
    }
    
    public void setNacionalidad (String na){
        this.nacionalidad = na;
    }

    //toString
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", edad: " + edad + ", genero: " + genero + ", nacionalidad: " + nacionalidad + '}';
    }

 public void presentacionIdioma() {
     switch (this.nacionalidad) {
         case "Español":
             System.out.println("Hola, soy " + this.nombre + " tengo " + this.edad + " años, mi género es " + this.genero + " y mi nacionalidad es " + this.nacionalidad);
             break;
         case "Inglés":
             System.out.println("Hi, I'm " + this.nombre + " i'm " + this.edad+"years old, my gender is "+ this.genero + " and i'm " + this.nacionalidad);
             break;
         case "Italiano":
            System.out.println("Ciao, sono " + this.nombre + " ho " + this.edad + " anni, il mio genere è " + this.genero + " e sono " + this.nacionalidad);
             break;
         case "Francés":
                     System.out.println("Bonjur, je m'appelle " + this.nombre + " j'ai " + this.edad + " ans, je suis une " + this.genero + " et je suis " + this.nacionalidad);
             break;
         default:
             throw new AssertionError();
     }
 }
    }
 
