public class Ejercicio12 {

    /*Programa que al que puedasd pasarle un párrafo de un texto 
     * y una palabra que se quiera cambiar en dicho texto. EL programa 
     * devuelve el mismo texto pero con la palabra cambiada en todas sus apariciones.
     * (Casa --> edificación)
     */
    public static void main(String[] args) {
        
        String frase = System.console().readLine("Introduce una frase: ");
        String antigua = System.console().readLine("Qué palabra quieres cambiar?: ");
        String nueva = System.console().readLine("Por cuál quieres cambiarla? ");
        String fraseCambiada = frase.replace(antigua, nueva);

        System.out.println(fraseCambiada);

    }
}
