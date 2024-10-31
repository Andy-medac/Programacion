public class Ejercicio3 {
    /* El programa principal (main) pide un número al usuario y muestra un menú con opciones:

1. Método que imprime si un número pasado como parámetro es par o impar (imprime la palabra “par” o la palabra “impar”).

2. Método que imprime directamente la tabla de multiplicar del número que le pasamos como parámetro.

3. Método que imprime un número que sea la mitad del número que le pasamos como parámetro.

4. Método que imprime un número aleatorio entre el 0 y el número que le pasamos como parámetro.

5. Método que comprueba si es primo e imprime si lo es o no.*/

    public static void parImpar(int numParImpar){
        if (numParImpar%2 == 0) {
            System.out.println("El número es par");
        }

        else {
            System.out.println("El número es impar");
        }
    }

    public static void multiplicar(int numMultiplicar){
        for (int i = 0; i<11; i++) {
            System.out.println(numMultiplicar + " x " + i + " = " + numMultiplicar*i);
        }
    }

    public static void aleatorio(int numAleatorio){
        int aleatorio = (int)(Math.random()*numAleatorio);
        System.out.println(aleatorio);
    }

    public static void mitad (int numMitad){
        numMitad /= 2;
        System.out.println("la mitad del número es " + numMitad);
    }

    public static void primoONo(int numPrimo){

        int numDivisibles = 0;

        for(int i = 1; i<=numPrimo; i++){
        
            if (numPrimo % i == 0) {
                numDivisibles++;//divide todos los números menores que él, si encuentra un número que de de resto 0, cuenta las veces
            }

        }
    
        if (numDivisibles == 2) {
            System.out.println("El número es primo");  
            }
    
        else if (numDivisibles>2) {
            System.out.println("El número no es primo");
        }
    }


    public static void main(String[] args) {
        
        System.out.println("1. Num par o impar");
        System.out.println("2. Tabla de multiplicar");
        System.out.println("3. Mitad");
        System.out.println("4. Numero aleatorio");
        System.out.println("5. Primo o no primo");

        int seccion = Integer.parseInt(System.console().readLine("Introduce una sección: "));
        int numeroU = Integer.parseInt(System.console().readLine("Introduce un número: "));


        if (seccion == 1) {
            parImpar(numeroU);
        }

        else if (seccion == 2) {
            multiplicar(numeroU);
        }

        else if (seccion == 3) {
            mitad(numeroU);        
        }

        else if (seccion == 4) {
            aleatorio(numeroU);
        }

        else if (seccion == 5) {
            primoONo(numeroU);
        }
    }
}
