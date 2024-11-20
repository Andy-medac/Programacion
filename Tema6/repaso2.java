public class repaso2 {

    /*
     * Genera un array de 10 posiciones relleno con interrogaciones '?'. En una de
     * sus posiciones, aleatoria, habrá un asterisco, pero no se mostrará al
     * usuario. El programa irá preguntando en qué posición cree el usuario que está
     * el asterisco, y le irá dando pistas indicando si debe probar en una posición
     * superior o inferior. Se repite una y otra vez hasta que el usuario acierta,
     * momento en el que se da la enhorabuena y finaliza el programa.
     */

    public static void main(String[] args) {

        String interrogaciones[] = {"?", "?", "?", "?", "?", "?", "?", "?", "?", "?"};
    
        String asterisco = "*";
        int posicion = (int) (Math.random() * 9); //genero un num ale 
        interrogaciones[posicion] = asterisco; //el num es la posicion del asterisco
        

        while (true) {
            
            int posicionU = Integer.parseInt(System.console().readLine("en qué posición está el asterisco? (0-9) "));

            if (posicionU == posicion) {
                System.out.println("Lo adivinaste!");
                for (int i = 0; i < interrogaciones.length; i++) {
                    System.out.println(interrogaciones[i]);
                }
                break;
            }

            else {
                System.out.println("No lo adivinaste :(");
            }
        }

    }
}
