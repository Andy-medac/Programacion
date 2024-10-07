public class Ejercicio15 {
    public static void main(String[] args) {
          /*Desarrolla un programa con el que puedas jugar al piedra, papel o tijera*/

        //Math.random genera números aleatorios entre 0 y 1
        //Yo quiero:
        // - Sea entre 0 y 2 (para las 3 opciones posibles)
        // - No quiero decimales


        //Para que Java haga primero la multiplicación, se ponen paréntesis

        /*System.out.println( Math.random( )*3 ); lo multiplico por 3 para que cuando genero un número, 
        se multiplique (voy a tener 0 y pico, 1 y pico y 2 y pico)*/
        //Pongo delante un (int) para covertirlo a numero entero y así no dé fallo

        
          int numero = (int)(Math.random()*3);
        //Aqui decimos qué números son piedra, papel o tijera
        
        switch (numero) {
            case 0:
                System.out.println("piedra");
                break;

            case 1:
                System.out.println("papel");
                break;
          
            case 2:
                System.out.println("tijera");
                break;

            default:
                break;
          }
          
    }
}
