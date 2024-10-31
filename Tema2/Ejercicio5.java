/* Desarrolla un programa que pida por consola al usuario 
cuánto vale un billete de tren, y cuántos billetes necesita comprar 
y muestre el dinero total que va a gastarse*/

public class Ejercicio5 {

    public static void main(String[] args) {

                                                        
     /* Otra manera de hacerlo todo en una línea puede ser: 
        Guardo la variable    la convierto       pregunto
        float precioBillete = Float.parseFloat ( System.console().readLine("¿Cuánto vale el billete?") ); */ 
    
        String precioBillete = System.console().readLine("¿Cuánto vale el billete? ");
        float precioBilleteNum = Float.parseFloat(precioBillete);

        String numeroBillete = System.console().readLine("¿Cuántos vas a comprar? ");
        int numeroBilleteNum= Integer.parseInt(numeroBillete);

        float precioFinal = precioBilleteNum*numeroBilleteNum;

        System.out.println("El precio final es " + precioFinal);

    }
}
