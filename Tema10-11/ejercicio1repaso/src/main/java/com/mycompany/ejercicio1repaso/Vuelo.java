
package com.mycompany.ejercicio1repaso;

public class Vuelo {
    
    private String origen;
    private String destino;
    private int duracion;
    private int pasajeros;
    private double distancia;
    private double preciob;
    
    public Vuelo (String o, String des, int d, int p, double dis, double pre){
        
        this.origen = o;
        this.destino = des;
        this.duracion = d;
        this.pasajeros = p;
        this.distancia = dis;
        this.preciob = pre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String o) {
        this.origen = o;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String des) {
        this.destino = des;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int d) {
        this.duracion = d;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int p) {
        this.pasajeros = p;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double dis) {
        this.distancia = dis;
    }

    public double getPreciob() {
        return preciob;
    }

    public void setPreciob(double pre) {
        this.preciob = pre;
    }
    
    //Métodos
    
    public double calcularIngresosTotales(){
      
        double total = this.preciob * this.pasajeros;
        
        if (this.distancia>5000) {
            total += total*0.10f;
        }
        
        return total;
    }
    
   public double  calcularCombustible(){
       int combustible = 4;
       double combustibleTotal = combustible * this.distancia;
       
       return combustibleTotal;
   }
   
   public boolean esVueloLargo(){
       boolean largo;
       
       if (this.duracion > 300) {
           largo = true;
          return largo;
       }
       else{
           largo = false;
           return largo;
       }
   }
}
