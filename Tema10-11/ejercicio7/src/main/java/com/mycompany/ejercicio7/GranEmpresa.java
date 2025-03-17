package com.mycompany.ejercicio7;

/**
Una gestoría trabaja con varios tipos de empresas (autónomos, pymes y grandes empresas). Por supuesto, en la gestoría trabajan gestores.


Su software de gestión debe poder clasificar a las empresas:
- Todas tienen nombre y CIF.
- Las pymes también tienen sede y número de socios.
- Las grandes empresas también tienen sede y patrimonio (en euros).

Por otro lado, los gestores tienen nombre, número de teléfono y email.
La gestoría asigna 1 gestor a los autónomos, 2 gestores a las pymes y 5 gestores a las grandes empresas.
Crea 10 gestores en el main y asignarlos en función de las empresas que se creen.
(La asignación de gestores a las empresas debe hacerse en la clase Gestoría)
(En el main se crean los gestores y las empresas y se le pasan a la Gestoría para que asigne).
 */
public class GranEmpresa extends Empresa{
    
    private String sede;
    private int patrimonio;
    
    public GranEmpresa(String nombre, String cif, String s, int p){
        super(nombre, cif);
        this.sede = s;
        this.patrimonio = p;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String s) {
        this.sede = s;
    }

    public int getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(int p) {
        this.patrimonio = p;
    }
    
    
}
