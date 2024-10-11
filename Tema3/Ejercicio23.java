public class Ejercicio23 {
    //Programa que te pregunta tu edad y te dice todos los años que has cumplido desde que naciste (Desde 1 hasta ahora)
    public static void main(String[] args) {
        
        int edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));

        for (int i = 1; i <= edad; i++){
            System.out.println("Cumpliste " + i + " años hace " + (edad-i) + " años.");
        }
    }
}
