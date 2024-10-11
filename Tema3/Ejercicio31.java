public class Ejercicio31 {

/* Programa hucha, al que le dices cuanto quieres ahorrar y luego vas metiendo y te avisa cuando tienes suficiente*/

    public static void main(String[] args) {
        
        int ahorro = Integer.parseInt(System.console().readLine("¿Cuánto dinero quieres ahorrar? "));
        int hucha = 0;

        //Para que se repita de manera infinita, ponemos 1<2 que es una verdad absoluta y no puede cambiar
        for (int i = 0; 1<2; i++ ){

            hucha += Integer.parseInt(System.console().readLine("¿Cuánto dinero quieres meter en la hucha?"));

            if (hucha >= ahorro) {
                System.out.println("¡Has alcanzado el objetivo de " + ahorro + " euros!");
                break;
            }

            else {
                System.out.println("Te faltan " + (ahorro-hucha) + " euros.");
            }

        }


    }
}
