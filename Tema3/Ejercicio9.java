public class Ejercicio9 {
    public static void main(String[] args) {
        /* Programa que pregunte el precio de un producto y si es de primera necesidad o no
         * que calcule suprecio con IVA (10% primera necesidad y el resto un 21%)*/

       
         float precio = Float.parseFloat(System.console().readLine("Introduce el precio del producto: "));
         String producto = System.console().readLine("¿Es un producto de primera necesidad? ");
         float iva1 = precio * 1.21f;
         float iva2 = precio * 1.10f;
    
        if (producto.equals("si")) {
            
            System.out.println("El precio del producto es " + iva1 + " euros.");
        }

        else if (producto.equals("no")) {
             System.out.println("El precio del producto es " + iva2 + " euros.");
        } 
           
        else {
            System.out.println("No existe esa respuesta");
        }
    }
}
