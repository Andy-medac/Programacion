/*Desarrolla un programa que pregunte al usuario 2 números y después muestre 
por consola el resultado de una suma, resta, multiplicación y división. */

/*Cómo convertir un tipo de variable a otro:
String --> Int Interger.parseInt ()
String --> Float Float.parseFloat()
int --> Float (int)
Float --> int (float)
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        
        //Primero mostramos por pantalla las preguntas para introducir las variables y las convertimos a número.
        String numerouno = System.console().readLine("Introduzca el primer número:");
        int numeroA = Integer.parseInt(numerouno); 
        String numerodos = System.console().readLine("Introduzca el segundo número:");
        int numeroB= Integer.parseInt(numerodos); 

        int suma = numeroA+numeroB;
        int resta = numeroA-numeroB;
        int multiplicación = numeroA+numeroB;
        float división = (float)numeroA/(float)numeroB;

        //Después realizamos las operaciones y mostramos el resultado por pantalla.
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicación es " + multiplicación);
        System.out.println("El resultado de la división es " + división);


    }
}
