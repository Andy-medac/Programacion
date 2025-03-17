package com.mycompany.ejercicio6;

/**
 * Crea una clase Electrodomestico con atributos marca y consumoEnergetico.
 * Luego, crea subclases Lavadora (con atributo capacidadKg) y Televisor (con
 * atributo tamañoPulgadas).
 *
 * Implementa un método calcularConsumoDiario(int horasUso), que estime el
 * consumo en kWh basándose en el consumo energético (atributo) y las horas de
 * uso (se le pasan al método por parámetro al ejecutarlo en el main). Ten en
 * cuenta que la lavadora cuando está parada no consume nada, pero el televisor
 * sí, por lo que deberás sobreescribir el método en el televisor para
 * considerar también las horas que no se ha utilizado (24-horasUso).
 *
 * Para hacer pruebas, puedes considerar que la lavadora consume 1,5kWh mientras
 * funciona y 0kWh apagada, y el televisor consume 0,1kWh encendida y 0,001kWh
 * apagada.
 */
public class Electrodomestico {
    
    private String marca;
    private float consumoEnergetico;

    public Electrodomestico(String m, float cE) {
        this.marca = m;
        this.consumoEnergetico = cE;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public float getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(float cE) {
        this.consumoEnergetico = cE;
    }
    
    

    public String toString() {
        return "marca: " + this.marca + ", consumo energetico: " + this.consumoEnergetico;
    }
    
    public void calcularConsumoDiario(int horasUso){
        float consumo = this.consumoEnergetico*horasUso;
        System.out.println("El consumo energetico es de " + consumo + " kWh");
    }
}
