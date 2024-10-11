public class Ejercicio21 {
    public static void main(String[] args) {
        //Desarrolla un programa que muestre los números desde el que diga eñ usuario hasta el 0 (contando hacia atrás)

        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = numero; i>0; i--){
        System.out.println(i);
        }
    }
}
