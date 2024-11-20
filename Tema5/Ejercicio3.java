public class Ejercicio3 {
    
/*Desarrolla un método que reciba dos números enteros y calcule de forma recursiva
 * la potencia del primero elevado al segundo
 */

 public static int potencia (int a, int b){
    if (b==0) {
        return 1;
        //no hay potencia()
    }

    else {
        return a * potencia(a, b-1);
    }
 }
    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(System.console().readLine("Introduce una base: "));
        int num2 = Integer.parseInt(System.console().readLine("Introduce una potencia: "));

        System.out.println(potencia(num1, num2));
    }
}
