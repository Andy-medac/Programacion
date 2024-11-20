public class Ejercicio3 {

    /*Pregunta al usuario cuantas cosas tiene que comprar, crea una array de esa 
     * longitud y ve preguntando uno a uno los alimentos que tiene que comprar hasta llenar el array completo.
     * Cuando termine, imprimelo por pantalla.
     */

    public static void main(String[] args) {
        
        String articulos[];

        int longitud = Integer.parseInt(System.console().readLine("Introduce el número de productos que desea comprar: "));

        articulos = new String[longitud];

        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = System.console().readLine("Introduce el producto: ");
        }

        for (int i = 0; i < articulos.length; i++) {
            System.out.println("Artículo " + (i+1) + ": " + articulos[i]);
        }
        
    }
}
