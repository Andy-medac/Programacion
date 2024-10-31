public class Ejercicio1 {
    /*Desarrolla un programa que pida dos nuneros enteros al usuario
     * El programa debe pasar ambis números a un método, que se encargará de sumarlos y mostrar por consola el resultado
     */

     public static void suma (int numero1, int numero2){

        int sumar = numero1 + numero2;
        System.out.println("El resultado es " + sumar);

     }

     public static void suma(int n1, int n2, int n3){
        System.out.println(n1+n2+n3);
     }

    public static void main(String[] args) {

        int num1 = Integer.parseInt(System.console().readLine("Introduce un número: "));
        int num2 = Integer.parseInt(System.console().readLine("Introduce otro número: "));
        suma(num1, num2);

        //puedo volver a usar el método las veces que quiera
        int num3 = 6;
        int num4 = 8;
        int num5 = 18;
        suma(num3, num4, num5);

    }
}