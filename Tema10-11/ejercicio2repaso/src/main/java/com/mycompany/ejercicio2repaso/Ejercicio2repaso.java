package com.mycompany.ejercicio2repaso;

public class Ejercicio2repaso {

    public static void main(String[] args) {

       Producto p1 = new Producto("Manzana", 0.99d, 3);
       Producto p2 = new Producto("Naranja", 0.80d, 2);
       Producto p3 = new Producto("Limon", 0.60d, 9);
       Producto p4 = new Producto("Puerro", 0.88d, 3);
       Producto p5 = new Producto("Lechuga", 0.48d, 7);
       Producto p6 = new Producto("Tomate", 0.73d, 20);

       Seccion fruta = new Seccion("Fruteria");
       Seccion verdura = new Seccion("Verduras");
       fruta.agregarProducto(p1);
       fruta.agregarProducto(p2);
       fruta.agregarProducto(p3);
       verdura.agregarProducto(p4);
       verdura.agregarProducto(p5);
       verdura.agregarProducto(p6);
       fruta.imprimirListaProductos();
       verdura.imprimirListaProductos();
       
       Seccion[] secciones = {fruta, verdura};
       Supermercado s1 = new Supermercado("Masymas", "Jaen", secciones);
       
        System.out.println("El valor total del stock es de " + s1.calcularValorTotalStock()+ " euros.");
    }
}
