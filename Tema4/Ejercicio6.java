public class Ejercicio6 {

/*Calcular media de tres notas
 * Crear un método 
 */

    //Procedimiento: 
    public static void calcularMedia (int n1, int n2, int n3){
        System.out.println((n1+n2+n3)/3);
    }
    public static void main(String[] args) {
        
        int nota1 = Integer.parseInt(System.console().readLine("Introduce una nota: "));
        int nota2 = Integer.parseInt(System.console().readLine("Introduce una nota: "));
        int nota3 = Integer.parseInt(System.console().readLine("Introduce una nota: "));

        calcularMedia(nota1, nota2, nota3);
    }
}
