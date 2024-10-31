public class Pruebas2 {
    
    public static void main(String[] args) {

       
        System.out.println("Hola");
        String nombreUsuario = System.console().readLine("¿Cómo te llamas? "); //Para que el programa pregunte
        System.out.println("Bienvenidx " + nombreUsuario);
        String ciudad = System.console().readLine("¿De qué ciudad eres?"); 
        System.out.println("Adiós, " + nombreUsuario + ciudad);
 
 /*Con el string de arriba convertimos en una variable lo que respondamos en la terminal a la pregunta, 
 de modo que nos pueda mostrar por pantalla nuestro nombre.*/




    }
}
