public class Ejercicio14 {
    public static void main(String[] args) {
         /* Crea un menú que te de a elegir entre si quieres que te felicite tu santo, por tu cumpleaños o por tu aniversario.
     * - Si eliges tu santo, te preguntará tu nombre y te responderá algo como, por ejemplo: "feliz San Lucas".
     * - Si eliges cumpleaños, te preguntará cuántos cumples y entonces te felicitará incluyendo tu edad. Por ejemplo: "feliz 30 cumpleaños".
     * - Si eliges aniversario, te preguntará de qué es el aniversario para poder decirte algo como "feliz aniversario de boda".
     */

     String evento = System.console().readLine("Es tu santo, tu cumpleaños o tu aniversario? ");

     switch (evento) {
        case "santo":
           System.out.println("Feliz santo!"); 
            break;

        case "cumpleaños":
            System.out.println("Feliz cumpleaños!");
            break;

        case "aniversario":
            System.out.println("Feliz aniversario!");
            break;
     
     
        default:
            System.out.println("Respuesta incorrecta");
            break;
     }
    }
}
