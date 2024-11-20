public class repaso2String {
    /*
     * Desarrolla un programa que pregunta al usuario un tweet, y el usuario le
     * copie un tweet completo (que incluye un hashtag). El programa debe localizar,
     * entre todo el texto del tweet, cuál es exactamente el hashtag. Ejemplo:
     * Introduce un tweet: El jugador @rafanadal ha ganado su partido de semifinales
     * en el torneo de #rolandgarros
     * El hashtag encontrado es: #rolandgarros
     */

    public static void main(String[] args) {

        String tweet = System.console().readLine("Introduce un tweet: "); // pregunta el tweet

        int posicionH = tweet.indexOf("#"); // sacamos la posicion del hastag

        String hastag = tweet.substring(posicionH).split(" ")[0]; // guardamosla subcadena que esté en x posicion en el tweet

        System.out.println("El hastag es: " + hastag);
    }

}
