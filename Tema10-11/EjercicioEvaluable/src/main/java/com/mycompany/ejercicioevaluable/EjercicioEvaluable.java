package com.mycompany.ejercicioevaluable;

public class EjercicioEvaluable {

    public static void main(String[] args) {
        
        Parada M1 = new Parada("Chamartin");
        Parada M2 = new Parada("Plaza de castilla");
        Parada M3 = new Parada("Cuatro Caminos");
        Parada M4 = new Parada("Tribunal");
        Parada M5 = new Parada("Gran via");
        Parada M6 = new Parada("Sol");

        Parada[]  paradasM= {M1, M2, M3, M4, M5, M6};
        
        Metro m1 = new Metro("metroMadrid", paradasM, 3, 5);
        
        Parada A1 = new Parada("Menendez Pelayo");
        Parada A2 = new Parada("Castellana");
        Parada A3 = new Parada("Retiro");
        Parada A4 = new Parada("Bernabeu");
        Parada A5= new Parada("Prado");
        Parada[] paradasA =  {A1, A2, A3, A4, A5};
        
        Autobus a1 = new Autobus("busMadrid", paradasA, 9, CombustibleAutobus.hibrido);
      
        int tiempo = Integer.parseInt(System.console().readLine("Introduce el tiempo entre paradas (Autobus): "));
        a1.calcularViaje(paradasA, tiempo);
        tiempo = Integer.parseInt(System.console().readLine("Introduce el tiempo entre paradas  (Metro): "));
        m1.calcularViaje(paradasM, tiempo);
    }
}
