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
public class Lavadora extends Electrodomestico{
    
    private int capacidadKg;
    
    public Lavadora(String marca, float consumoEnergetico, int cK){
        super(marca, consumoEnergetico);
        this.capacidadKg = cK;
    }

    public int getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(int cK) {
        this.capacidadKg = cK;
    }


    public String toString() {
        return super.toString() + " capacidad en Kg: " + this.capacidadKg;
    }
    
}
