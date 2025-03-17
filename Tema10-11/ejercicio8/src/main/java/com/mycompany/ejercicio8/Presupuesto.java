package com.mycompany.ejercicio8;

/**
 * Un software debe poder crear facturas y presupuestos. En ambos documentos se
 * debe conocer el nombre de la empresa, el nombre del cliente, el DNI/CIF de
 * ambos, el concepto o conceptos cada uno con sus precios (máximo 5 conceptos
 * en cada factura o presupuesto). Las facturas también deben tener una
 * numeración y un precio total (con IVA). Los presupuestos también deben tener
 * un precio total (sin IVA). En el main, crea facturas y presupuestos de
 * prueba, añadiendo productos. Una vez añadidos, debes tener y llamar a un
 * método imprimirDocumento() o similar, que imprima por consola la palabra
 * “Factura” o “Presupuesto” seguida de todos los datos.
 */
public class Presupuesto extends Documento {
    
    private float precio;
    
    public Presupuesto (String e, String c, String dE, String dC, Concepto[] co, float p){
        super(e, c, dE, dC, co);
        this.precio = p;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float p) {
        this.precio = p;
    }

    @Override
    public String toString() {
        return "Presupuesto: " + " precio: " + this.precio;
    }
    
    @Override
    public void imprimirDocumento(){
        System.out.println("PRESUPUESTO:");
        System.out.println(super.toString() + ", precio: " + this.precio);
        
    }
}
