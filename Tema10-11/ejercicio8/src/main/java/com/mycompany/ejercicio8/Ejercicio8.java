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
public class Ejercicio8 {

    public static void main(String[] args) {
        
        Concepto c1 = new Concepto("Luz", 128.50f);
        Concepto c2 = new Concepto("Agua", 123f);
        Concepto c3 = new Concepto("Impuestos", 138f);
        Concepto[] conceptos = {c1, c2, c3};
        
        float precio = Concepto.sumaPrecio(conceptos);
        
        Factura f1 = new Factura("Carniceria SL", "Paco", "2039482H", "23284723J", conceptos, 293, precio);
        Presupuesto p1 = new Presupuesto("Peluqueria Mimos", "Adrian", "2374699H", "2938469J", conceptos, precio);
        
        p1.imprimirDocumento();
        f1.imprimirDocumento();

    }
}
