package com.mycompany.ejercicio2repaso;

public class Supermercado {
    
    private String nombre;
    private String ubicacion;
    private Seccion[] secciones;

    public Supermercado(String n, String u, Seccion[] s) {
        this.nombre = n;
        this.ubicacion = u;
        this.secciones = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String u) {
        this.ubicacion = u;
    }

    public Seccion[] getSecciones() {
        return secciones;
    }

    public void setSecciones(Seccion[] s) {
        this.secciones = s;
    }
    
    public double calcularValorTotalStock(){
        double stock = 0;
        
        for (int i = 0; i < secciones.length; i++) {
            
            stock += secciones[i].calcularValorTotalStock();
            
        }
        return stock;
        }
    }
 
