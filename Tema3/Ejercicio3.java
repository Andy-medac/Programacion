

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int dorsal = Integer.parseInt(System.console().readLine("Introduce el dorsal: "));


        //PARA USAR EL SIGNO = PARA INDICAR QUE ES IGUAL QUE, SE USA ==.
        if (dorsal == 7){
            System.out.println("El jugador es vinicius");
        }

        else if (dorsal == 9){
            System.out.println("El jugador es Mbappé");
        }

        else if (dorsal == 1){
            System.out.println("El jugador es Courtois");
        }

        else if (dorsal ==2) {
            System.out.println("El jugador es Carvajal");
        }

        else if (dorsal ==17){
            System.out.println("El jugador es Lucas Vázquez");
        }

        else {
            System.out.println("No existe ese dorsal");
        }
    }
}
