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
public class Documento {

    private String empresa;
    private String cliente;
    private String dniE;
    private String dniC;
    private Concepto[] conceptos;

    public Documento(String e, String c, String dE, String dC, Concepto[] co) {
        this.empresa = e;
        this.cliente = c;
        this.dniE = dE;
        this.dniC = dC;
        this.conceptos = co;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String e) {
        this.empresa = e;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String c) {
        this.cliente = c;
    }

    public String getDniE() {
        return dniE;
    }

    public void setDniE(String dE) {
        this.dniE = dE;
    }

    public String getDniC() {
        return dniC;
    }

    public void setDniC(String dC) {
        this.dniC = dC;
    }

    public Concepto[] getConceptos() {
        return this.conceptos;
    }

    public void setConceptos(Concepto[] co) {
        this.conceptos = co;
    }

    public String toString() {
        return " empresa: " + this.empresa + ", cliente: " + this.cliente + ", dni empresa:" + this.dniE + ", dni cliente: " + this.dniC;
    }
    
    public void imprimirDocumento(){
        System.out.println("documento");
    }
    

}
