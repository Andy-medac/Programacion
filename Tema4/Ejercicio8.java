public class Ejercicio8 {
    /* Desarrolla un programa que le pida al usuario y se lo pase a un método.
     * El método comprobará si es positivo, negativo o cero, y enviará una respuesta en formato STring al main.
     * El main muestra el resultado.
    */


    public static String comprobacion(int numero){
        
        String frase = "";
        
        if (numero == 0) {
            frase = "El número es 0";
        }

        else if (numero < 0) {
            frase = "El número es negativo";
        }

        else {
            frase = "El número es positivo";
        }

        return frase;
    }


    public static void main(String[] args) {
        
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));

        System.out.println(comprobacion(numU));
    }
}
