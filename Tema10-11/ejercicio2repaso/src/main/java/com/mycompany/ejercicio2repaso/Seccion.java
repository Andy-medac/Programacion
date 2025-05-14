package com.mycompany.ejercicio2repaso;

public class Seccion {
    
    private String nombre;
    private Producto[] productos;
    private int contador;

    public Seccion(String n) {
        this.nombre = n;
        this.productos = new Producto[10];
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    public String obtenerProductosBajoStock(){
        
        String productosBajoStock = "";
      
        for (int i = 0; i < contador; i++) {
          
            if (productos[i].getStock() < 5) {
                productosBajoStock += productos[i].getNombre() + " ";
            }
        }
        return productosBajoStock;
    }
    
    public double calcularValorTotalStock(){
        
        double stockTotal = 0;
        
        for (int i = 0; i < contador; i++) {
            stockTotal += (productos[i].getPrecio()*productos[i].getStock());
        }
        return stockTotal;
    }
    
    public void agregarProducto(Producto p){
        
        productos[contador] = p;
        contador++;
    }
    public void imprimirListaProductos(){
        for (int i = 0; i < contador; i++) {
            System.out.println(productos[i].getNombre());
        }
    }
}
