package com.mycompany.ejercicio4;

public class Partido {
    
    public static void simularJugada(Atacante at, Defensor de){
        int a = at.habilidadAtacante();
        int d = de.getHabilidadDefensa();
        if (a>d) {
            System.out.println("Gana el atacante con una puntuacion de " + a + " sobre " + d + " del defensor.");
        }
        else if (d>a) {
            System.out.println("Gana el defensor con una puntuacion de " + d + " sobre " + a + " del atacante.");
        }
        else{
            System.out.println("Hay empate." + " Puntuacion del atacante: " + a + " Puntuacion del defensor: " + d);
        }
    }
}
