public class Ejercicio40 {
    /*Programa que te dice si un número es primo (recuerda que 
    un número primo es aquel que solo es divisible entre él mismo 
    y entre el 1, es decir, solo da resultados enteros si lo 
    divides entre sí mismo o entre el 1, pero no hay ningún otro 
    número entre el que puedas dividirlo y que de un resultado exacto). */
public static void main(String[] args) {
    int numero = Integer.parseInt(System.console().readLine("Introduce un número: "));
    int numDivisibles = 0;

    for(int i = 1; i<=numero; i++){
        
        if (numero % i == 0) {
            numDivisibles++;
        }

        
    }
    
    if (numDivisibles == 2) {
          System.out.println("El número es primo");  
        }
    
    else if (numDivisibles>2) {
        System.out.println("El número no es primo");
    }
}
    
}