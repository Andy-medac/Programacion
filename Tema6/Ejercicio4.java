public class Ejercicio4 {

    /*
     * Desarrolla un programa que te dé a elegir lo siguiente:
     * 
     * -Elegir un número decimal aleatorio entre 0 y 1.
     * -Elegir número entero aleatorio entre 0 y 10.
     * -Elegir color aleatorio.
     * -Elegir una vocal aleatoria.
     */

    public static void numDecimal (int n1){

        float decimal = (float) (Math.random());
        System.out.println(decimal);

    }

    public static void numEntero (int n2){

        int entero = (int) (Math.random() * 11);
        System.out.println(entero);

    }

    public static void numColor (int n3){

        String color[] = { "blanco", "negro", "rojo", "naranja", "morado", "azul", "marrón", "verde", "amarillo" };
        int posicion = (int) (Math.random() * color.length);

        System.out.println(color[posicion]);

    }

    public static void numVocal (int n4){

        String vocal[] = { "a", "e", "i", "o", "u" };
        int numVocal = (int) (Math.random() * 5);
        switch (numVocal) {
            case 0:
                System.out.println(vocal[0]);
                break;

            case 1:
                System.out.println(vocal[1]);
                break;

            case 2:
                System.out.println(vocal[2]);
                break;

            case 3:
                System.out.println(vocal[3]);
                break;

            case 4:
                System.out.println(vocal[4]);
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("Elige una opción:");
        System.out.println("1.Elegir un número decimal aleatorio entre 0 y 1. ");
        System.out.println("2.Elegir número entero aleatorio entre 0 y 10.");
        System.out.println("3.Elegir color aleatorio.");
        System.out.println("4.Elegir vocal aleatoria");
        int num = Integer.parseInt(System.console().readLine());

        if (num == 1) {
            numDecimal(num);
        }

        if (num == 2) {
            numEntero(num);
        }

        else if (num == 3) {
            numColor(num);
        }

        else if (num == 4) {
            numVocal(num);
        }
    }
}
