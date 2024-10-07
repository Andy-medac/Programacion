public class Ejercicio7 {
    public static void main(String[] args) {
        /*Escribe un programa que nos diga si un número es par o impar */
        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

        if (numero%2 == 0) {
            System.out.println("El número es par");
        }

        else {
            System.out.println("El número es impar");
        }
    }
}
