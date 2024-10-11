public class Ejercicio18 {
/*Programa que muestre al azar el nombre de una carta de la baraja de poker.
 * La baraja tiene 4 palos: picas, diamantes, corazones y tréboles.
 * Y cada palo tiene 13 cartas: A, 2, 3, 4. 5. 6. 7. 8. 9. J, Q, y K.
 * Tu programa debrá mostrar algo como "4 de picas", "J de tréboles", etc.
 */

    public static void main(String[] args) {
        
        int numPalo = (int) (Math.random()*4+1);
        
        String palo = "";

        switch (numPalo) {
            case 1:
                palo = ("picas") ;
                break;
        
            case 2: 
                palo = ("corazones") ;
                break;

            case 3: 
                palo = ("diamantes") ;
               break;

            case 4: 
                palo = ("tréboles") ;

            default:
                break;
        }
        
        int numCartasPalo = (int) (Math.random()*13+1);
        String cartasPalo = "";

        switch (numCartasPalo) {
            case 1:
               cartasPalo = ("A");
                break;
        
            case 2:
                cartasPalo = ("2");
                break;

            case 3:
                cartasPalo = ("3");
                break;

            case 4:
                cartasPalo = ("4");
                break;

            case 5:
                cartasPalo = ("5");
                break;

            case 6:
                cartasPalo = ("6");
                break;

            case 7:
                cartasPalo = ("7");
                break;

            case 8:
                cartasPalo = ("8");
                break;

            case 9:
                cartasPalo = ("9");
                break;

            case 10:
                cartasPalo = ("J");
                break;

            case 11:
                cartasPalo = ("Q");
                break;

            case 12:
                cartasPalo = ("K");
                break;

            default:
                break;
        }


        System.out.println("La carta que ha salido es el " + cartasPalo + " de " + palo + ".");
    }
}
