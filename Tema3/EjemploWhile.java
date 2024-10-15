public class EjemploWhile {
    public static void main(String[] args) {
        int ahorro = Integer.parseInt(System.console().readLine("¿Cuánto dinero quieres ahorrar? "));
        int hucha = 0;

        while (hucha < ahorro){

            hucha += Integer.parseInt(System.console().readLine("¿Cuánto dinero quieres meter en la hucha? "));
            System.out.println("Te faltan " + (ahorro-hucha) + " euros.");
        } 
        
        System.out.println("¡Has alcanzado el objetivo de " + ahorro + " euros!");
    }
}
