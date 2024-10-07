public class Ejercicio10 {
    public static void main(String[] args) {

        /*Un test que se vaya autocorrigiendo y te muestre la nota al final */

        String kazuha = System.console().readLine("¿Es kazuha del elemento hydro?");

        int nota = 0; 

        if (kazuha.equals("no")) {
            System.out.println("Has acertado");
            nota = 1;
        }

        else if (kazuha.equals("si")) {
            System.out.println("No has acertado");
        }

        else {
            System.out.println("No existe esa respuesta");
        }

        String mualani = System.console().readLine("¿Es mualani del elemento electro?");

        if (mualani.equals("si")) {
            System.out.println(" No has acertado");
        }

        else if (mualani.equals("no")) {
            System.out.println("Has acertado");
            nota = nota +1; 
        }

        else {
            System.out.println("No existe esa respuesta");
        }

        String diluc = System.console().readLine("¿Es diluc del elemento pyro?");

        if (diluc.equals("si")) {
            System.out.println("Has acertado");
            nota = nota +1; 
        }

        else if (diluc.equals("no")) {
            System.out.println("No has acertado");
        }

        else {
            System.out.println("No existe esa respuesta");
        }

        String trotamundos = System.console().readLine("¿Es el trotamundos del elemento anemo?");

        if (trotamundos.equals("si")) {
            System.out.println("Has acertado");
            nota = nota +1; 
        }

        else if (trotamundos.equals("no")) {
            System.out.println("No has acertado");
        }

        else {
            System.out.println("No existe esa respuesta");
        }

        String nahida = System.console().readLine("¿Es nahida del elemento dendro?");

        if (nahida.equals("si")) {
            System.out.println("Has acertado");
            nota = nota +1; 
        }

        else if (nahida.equals("no")) {
            System.out.println("No has acertado");
        }

        else {
            System.out.println("No existe esa respuesta");
        }

        System.out.println("Tu nota final es de " + nota + " sobre 5");

    }
}
