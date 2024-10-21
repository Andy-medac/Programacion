public class Ejercicio38 {
    /* Programa que te pide la base y el exponente de una 
    potencia y te devuelve el resultado.*/
    public static void main(String[] args) {
        int base = Integer.parseInt(System.console().readLine("Introduce una base: "));
        int exponente = Integer.parseInt(System.console().readLine("Introduce un exponente: "));
        int resultado = base;

        for (int i= 1; i<exponente; i++){
            resultado *= base;
        }

        System.out.println("El resultado es " + resultado);
    }
}
