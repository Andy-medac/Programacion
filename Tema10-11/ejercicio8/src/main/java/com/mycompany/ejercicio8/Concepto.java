package com.mycompany.ejercicio8;

public class Concepto {

   
    private String descripcion;
    private float precioTotal;

    public Concepto(String d, float p) {
        this.descripcion = d;
        this.precioTotal = p;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float p) {
        this.precioTotal = p;
    }    

    @Override
    public String toString() {
        return " descripcion: " + this.descripcion + " precio: " + this.precioTotal;
    }
    
        public static float sumaPrecio(Concepto[] concepto){
        float precio = 0;
        for (int i = 0; i < concepto.length; i++) {
            precio += concepto[i].getPrecioTotal();
        }
        return precio;
    }
}
