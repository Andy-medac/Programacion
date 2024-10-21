public class Ejercicio37 {
    /*Programa que pide un número y devuelve su factorial 
    (la operación matemática conocida como 'factorial' es 
    el resultado de multiplicar un número por todos los números 
    menores que él, excepto el 0. Es decir, el factorial 
    del 5 por ejemplo sería el resultado de 5*4*3*2*1). */
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));

        for (int i = numero-1; i>0; i--){
             numero = numero*i;
            
        }
    
        System.out.println("El resultado es " + numero);
    }
}
