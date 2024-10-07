public class Ejercicio8 {
    public static void main(String[] args) {
        /*Tienda de banderas.
        El programa pide el ancho y alto de la bandera en cm (se cobra a dos 2cnts por cm2)
        se pregunta si se desea escudo bordado (2.5)
        se pregunta si se envía (5€)*/

        float ancho = Float.parseFloat(System.console().readLine("Introduce el ancho de la bandera: "));
        float alto = Float.parseFloat(System.console().readLine("Introduce el alto de la bandera: "));

        float cm = ancho*alto;
        float precio = cm*0.02f;
        float euros = precio/100;

        System.out.println("Su bandera costará " + euros + " euros.");


        String escudo = System.console().readLine("Quiere el escudo bordado? ");
        if (escudo.equals("si")) {
             euros = euros+2.5f;
            System.out.println("Su bandera costará " + euros + " euros.");   
        }

        else if (escudo.equals("no")) {
            System.out.println("El precio no cambia");
        }

        else {
            System.out.println("Respuesta no válida");
        }
        
        String envio = System.console().readLine("¿Quiere envío? ");
        if (envio.equals("si")) {
             euros = euros+5;
            System.out.println("Su bandera costará " + euros + " euros.");      
        }

        else if (envio.equals("no")) {
            System.out.println("El precio es de " + euros + " euros.");
        }
        
        else {
            System.out.println("Respuesta no válida");
        }
    }
}
