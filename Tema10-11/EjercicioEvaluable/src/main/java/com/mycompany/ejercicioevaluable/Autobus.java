package com.mycompany.ejercicioevaluable;

public class Autobus extends Transporte {

    private CombustibleAutobus combustible;

    public Autobus(String nombre, Parada[] paradas, int tiempo, CombustibleAutobus c) {
        super(nombre, paradas, tiempo);
        this.combustible = c;
    }

    public CombustibleAutobus getCombustible() {
        return combustible;
    }

    public void setCombustible(CombustibleAutobus c) {
        this.combustible = c;
    }

    //Métodos 
    @Override
    public void calcularViaje(Parada[] p, int t) {
        String p1 = System.console().readLine("Introduce la primera parada (Autobus): ");
        String p2 = System.console().readLine("Introduce la segunda parada(Autobus): ");
        int posicion1 = 0;
        int posicion2 = 0;
        int duracion = 0;

        for (int i = 0; i < p.length; i++) {
            posicion1++;
            if (p1.equals(p[i].getNombre())) {
                posicion1++;
                break;
            }
        }
        for (int i = 0; i < p.length; i++) {
            posicion2++;
            if (p2.equals(p[i].getNombre())) {
                posicion2++;
                break;
            }
        }
        duracion = (posicion2-posicion1)*t;
        System.out.println("El viaje desde " + p1 + " hasta " + p2 + " es de " + duracion + " minutos");
    }

    //toString
    public String toString() {
        return "combustible: " + this.combustible;
    }
    
}
