public class Pruebas3 {
    public static void main(String[] args) {
        
        //En este caso sobreescribimos el valor de la variable.


        int numero = 5;

        numero = 6; 
        numero = 120; 

        //Pero si ponemos "final" al lado de la variable y se vuelve una constante, por lo tanto no se va a poder cambiar.

        final String saludo = "Hola";

        System.out.println(saludo);
        System.out.println(numero);
    }
}
