public class Ejercicio19 {
    /*
     *  Juego ‘jugador contra PC’ de piedra, papel o tijera. Primero el usuario introduce su elección, 
     * después el programa genera aleatoriamente la suya y la muestra, 
     * y por último el programa indica quién ha ganado.
     */
    public static void main(String[] args) {
        //Preguntamos al usuario 
        String usuario = System.console().readLine("Jugador contra PC, elija: 1.Piedra, 2.Papel, 3.Tijera: ");

        int numero = (int)(Math.random()*3+1);
        String maquina = "";

        //Sacamos un piedra, papel, o tijera ALEATORIO
        switch (numero) {
            case 1:
            maquina = "piedra";
            System.out.println("Yo saco " + maquina);
        
            case 2:
            maquina = "papel";
            System.out.println("Yo saco " + maquina);

            case 3:
            maquina = "tijeras";
            System.out.println("Yo saco" + maquina);

            default:
                break;
}

            if (usuario.equals("piedra") && maquina.equals("papel")) {
                System.out.println("Gana la máquina");
            }

            else if (usuario.equals("piedra") && maquina.equals("tijeras")) {
                System.out.println("Ganas tú");
            }
            
            else if (usuario.equals("papel") && maquina.equals("tijeras")) {
                System.out.println("Gana la máquina");
            }

            else if (usuario.equals("papel") && maquina.equals("piedra")) {
                System.out.println("Ganas tú");
            }

            else if (usuario.equals("tijeras") && maquina.equals("piedra")) {
                System.out.println("Gana la máquina");
            }

            else if (usuario.equals("tijeras") && maquina.equals("papel")) {
                    System.out.println("Ganas tú");
            }

            else {
                System.out.println("Empate");
            }
        
    }
}
