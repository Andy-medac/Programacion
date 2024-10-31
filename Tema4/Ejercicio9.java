public class Ejercicio9 {

    /* Desarrolla un programa que pida al usuario una temperatura, preguntándole
     * primero si la quiere introducir en C, F o K
     * 
     * Si se introducen en F o K, se convierten primero a C (método)
     * 
     * Una vez los tenemos en C, se pasan los grados a otro método que devuelve al main la palabra "frío",
     * "templado" o "calor".
    */

    public static float unidad (float grados, String tipo){
    
        float convertido = 0;
        
        if (tipo.equals("k")) {
            convertido = grados - 273.15f;
        }

        else if (tipo.equals("f")) {
            convertido = (grados - 32)* 0.5f;
        }

        else if (tipo.equals("c")) {
            convertido = grados;
        }


        return convertido;

    }

    public static String temperatura (float celsius){

        String frase = "";

        if (celsius <= 20) {
            frase = "hace frío";
        }

        else if (celsius > 20 && celsius < 25 ) {
            frase = ", es una temperatura templada";
        }

        else{
            frase = "hace calor";
        }

        return frase;
    }

    public static void main(String[] args) {

        String temperaturaU = System.console().readLine("Introduce el tipo de temperatura: ");
        float num = Float.parseFloat(System.console().readLine("Introduce los grados: "));
        
        float temperaturaConvertida = unidad(num, temperaturaU);

        System.out.println( "Son " + temperaturaConvertida + "ºC" + " y " + temperatura(temperaturaConvertida));



    }

}
