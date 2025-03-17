package com.mycompany.ejercicioevaluable;

public class Metro extends Transporte {

    //atributos
    private int numVagones;

    //constructor
    public Metro(String nombre, Parada[] paradas, int tiempo, int nV) {
        super(nombre, paradas, tiempo);
        this.numVagones = nV;
    }

    //getters y setters
    public int getNumVagones() {
        return numVagones;
    }

    public void setNumVagones(int nV) {
        this.numVagones = nV;
    }

    //Métodos 
    @Override
    public void calcularViaje(Parada[] p, int t) {
        String p1 = System.console().readLine("Introduce la primera parada (Metro): ");
        String p2 = System.console().readLine("Introduce la segunda parada(Metro): ");
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
        duracion = (posicion2 - posicion1) * t;
        System.out.println("El viaje desde " + p1 + " hasta " + p2 + " es de " + duracion + " minutos");
    }

    @Override
    public String toString() {
        return"numero de vagones: " + this.numVagones;
    }

}

