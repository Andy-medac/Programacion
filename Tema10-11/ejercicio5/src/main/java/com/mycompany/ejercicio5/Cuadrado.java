
package com.mycompany.ejercicio5;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println(lado*lado);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(lado*4);
    }
}
