

public class Ejercicio1 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(System.console().readLine("Introduce tu edad: "));

        if (edad<18){
            System.out.println("No puedes entrar, no eres mayor de edad");
        }

        else {
            System.out.println("Puedes entrar");
        }
    }
}
