public class Ejercicio24 {
    //Programa que imprime todos los números pares desde el dos hasta que diga el usuario
    public static void main(String[] args) {
        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = 2; i<=numero; i=i+2){
        System.out.print(" "+ i + " ");
        }
    }
}
