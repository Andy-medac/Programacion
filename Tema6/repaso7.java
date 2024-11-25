public class repaso7 {

    /*
     * Desarrolla un tablero de 10x10 y sitúa una ficha (representada por cualquier
     * caracter) en la posición 0,0. El pide al usuario una entrada cualquiera para
     * moverse, por ejemplo "", momento en el que
     * simulará tirar el dado generando un número aleatorio entre 1 y 6, y la ficha
     * avanzará las casillas necesarias. Después, el programa se repetirá una y otra
     * vez pudiendo mover la ficha tantas veces como sea necesario. Es importante
     * seguir el movimiento de una ficha de monopoly por el tablero, recorriendo
     * siempre los bordes y girando cada vez que se lleva a una esquina. El programa
     * finaliza cuando la ficha vuelve a pasar por la posición de salida.
     */

    public static void main(String[] args) {

        String tablero[][] = new String[10][10];
        int fila = 0;
        int columna = 0;
        String personaje = "{F}";

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = "{ }";
            }
        }

        while (true) {
            
            tablero[fila][columna] = "{F}";
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            String ficha = System.console().readLine("presiona 'a' para mover ficha: ");
            int dado = (int) (Math.random()*6+1);
            tablero[fila][columna] = "{ }";

            if (ficha.equals("a")) {

                for (int i = 0; i < dado; i++) {
                
                if (fila == 0) {
                    if (columna < 9) {
                        columna++;
                    }
                    else {
                        fila++;
                    }
                }
                
                else if (columna == 9) {
                    if (fila < 9) {
                        fila++;
                    }
                    else {
                        columna--;
                    }
                }
                
                else if (fila == 9) {
                    if (columna > 0) {
                        columna--;
                    }
                    else {
                        fila--;
                    }
                }
                
                else if (columna == 0) {
                    if (fila > 0) {
                        fila--;
                    }
                    else {
                        columna++;
                    }
                }
            }

            tablero[fila][columna] = personaje;

            }
            
            if (fila == 0 && columna == 0) {
                System.out.println("Fin del juego, has ganado!!!");
                break;
            }
        }

    }
}
