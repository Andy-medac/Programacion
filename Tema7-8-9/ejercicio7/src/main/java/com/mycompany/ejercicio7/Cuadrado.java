package com.mycompany.ejercicio7;

public class Cuadrado {
    private int lado;
    private String caracterDibujo;
    
    //Constructor
    public Cuadrado(int l, String c){
        this.lado = l;
        this.caracterDibujo = c;
    }
    
    //getters
    public int getLado(){
        return this.lado;
    }
    
    public String getCaracterDibujo(){
        return this.caracterDibujo;
    }
    
    //Setters
    public void setLado(int l){
        this.lado = l;
    }
    
    public void setCaracterDibujo(String c){
        this.caracterDibujo = c;
    }
    
    //Métodos 
    
    public String toString(){
        return "El cuadrado tiene un lado de " + this.lado + " y su caracter es " + this.caracterDibujo;
    }
    
    public void imprimirLado(){
        System.out.println("El lado del cuadrado es de " + this.lado);
    }
    
    public void imprimirCaracter(){
        System.out.println("El caracter del cuadrado es: " + this.caracterDibujo);
    }
    
    public void dibujarCuadrado (){

        for (int i = 0; i<this.lado; i++){
        
            for (int j = 0; j<this.lado-1; j++){
                System.out.print("* ");
            }

            System.out.println("*");
        }
    }
}
