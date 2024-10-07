public class Ejercicio18 {
/*Programa que muestre al azar el nombre de una carta de la baraja de poker.
 * La baraja tiene 4 palos: picas, diamantes, corazones y tréboles.
 * Y cada palo tiene 13 cartas: A, 2, 3, 4. 5. 6. 7. 8. 9. J, Q, y K.
 * Tu programa debrá mostrar algo como "4 de picas", "J de tréboles", etc.
 */

    public static void main(String[] args) {
        
        int palo = (int) (Math.random()*4+1);
        int cartasPalo = (int) (Math.random()*13+1);

        switch (palo) {
            case 1:
                System.out.println ("picas") ;
                break;
        
            case 2: 
                System.out.println ("corazones") ;
                break;

            case 3: 
                System.out.println ("diamantes") ;
               break;

            case 4: 
                System.out.println ("tréboles") ;

            default:
                break;
        }

        switch (cartasPalo) {
            case 1:
               System.out.println("A");
                break;
        
            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 5:
                System.out.println("5");
                break;

            case 6:
                System.out.println("6");
                break;

            case 7:
                System.out.println("7");
                break;

            case 8:
                System.out.println("8");
                break;

            case 9:
                System.out.println("9");
                break;

            case 10:
                System.out.println("J");
                break;

            case 11:
                System.out.println("Q");
                break;

            case 12:
                System.out.println("K");
                break;

            default:
                break;
        }


        System.out.println("La carta que ha salido es el " + cartasPalo + " de " + palo);
    }
}
