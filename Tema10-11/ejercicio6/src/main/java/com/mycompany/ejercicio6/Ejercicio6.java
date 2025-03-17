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
public class Ejercicio6 {

    public static void main(String[] args) {
        
        Lavadora lavadora = new Lavadora("Bosh", 1.5f, 12);
        Televisor tele = new Televisor("Samsung", 0.1f, 32);
        
        int horasUso = Integer.parseInt(System.console().readLine("Introduce las horas de uso: "));
        
        lavadora.calcularConsumoDiario(horasUso);
        tele.calcularConsumoDiario(horasUso);
    }
}
