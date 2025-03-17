package com.mycompany.ejercicio5;

public class Circulo extends Figura {
    
    private int radio;

public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println(Math.PI*(this.radio*this.radio));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(Math.PI*(this.radio*2));
    }
}
