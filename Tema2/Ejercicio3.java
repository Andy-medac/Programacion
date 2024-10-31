public class Ejercicio3 {

    /*Desarrolla un programa que sirva a un cajerx de una tienda. Debe hacer lo siguiente:
     Preguntar cuánto vale un producto.
     Indicar cuánto dinero entrega el cliente.
     Indicar cuánto dineor se debe devolver.
     */

    public static void main(String[] args) {
        
        String precio = System.console().readLine("Precio del producto:");
        int precioNum = Integer.parseInt(precio); 
        String pago = System.console().readLine("Dinero recibido:");
        int pagoNum = Integer.parseInt(pago); 

        float cambioFinal = (precioNum - pagoNum );


        System.out.println("El dinero a deber es " + cambioFinal);

    }
}
