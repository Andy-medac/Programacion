package com.mycompany.ejercicio2repaso;

public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String n, double p, int s) {
        this.nombre = n;
        this.precio = p;
        this.stock = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double p) {
        this.precio = p;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int s) {
        this.stock = s;
    }
    
    public boolean estaAgotado(){
        if (this.stock > 0) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean esBajoStock(){
        if (this.stock < 5) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public double calcularValorStock(){
        return (this.precio * this.stock);
    }
}
