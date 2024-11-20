public class Ejercicio11 {
    public static void main(String[] args) {
        //Gusano que se come los 8 y los 0 que encuentra y los cambia por x

    String cadenaNum = System.console().readLine("Introduce una cadena: ");

    cadenaNum = cadenaNum.replace("0", "x");
    cadenaNum = cadenaNum.replace("8", "x");
    
    System.out.println("El gusano se comió algo... " + cadenaNum);

    }
}

