public class variables {
    public static void main(String[] args) {

        // Variables
        int numero = 25; // int para números enteros SIEMPRE
        String nombre = " camisetas"; //String para texto, con que haya una sola letra o algo que no sea un número, se usa.
        float precio = 19.95f; //Cuando es un número entero, se debe poner una f al final
        char talla = 'm'; //IMPORTANTE en char se usan las comillas '', no las normales "".
        
        //char para un solo caracter, NO SE USA PARA NÚMEROS
        //float para números decimales
        // por ejemplo, también se puede poner un +6 para indicar que sume 6 a la edad (edad+6)
        // Las comillas se usan para que me muestre literalmente lo que hay entre paréntesis
        
        System.out.println( numero + nombre + " talla " + talla + " cuestan " + precio + " euros");
        
    }

}