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
public class Factura extends Documento{

    private int numeracion;
    private float precio;
    
    public Factura (String e, String c, String dE, String dC, Concepto[] co, int n, float p){
        super(e, c, dE, dC, co);
        this.numeracion = n;
        this.precio = p*1.21f;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int n) {
        this.numeracion = n;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float p) {
        this.precio = p;
    }

    @Override
    public String toString() {
        return "Factura: " + " numeracion: " + this.numeracion + ", precio: " + this.precio ;
    }
    
    @Override
    public void imprimirDocumento(){
        System.out.println("FACTURA:");
        
        System.out.println(super.toString() + " numeracion: " + this.numeracion + ", precio: " + this.precio);
        
    }
}
