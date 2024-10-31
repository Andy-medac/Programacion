public class Ejercicio4 {
    /*Programa que pida al usuario el precio de un producto y llame a un método para que calcule el precio con el IVA
     * Ten en cuenta que dependiendo del producto puede ser el IVA de un 0%, el 5%, 10% o el 21%. Haz sobrecarga de métodos
     * para que se pueda invocar la función de dos formas:
     * 
     * - Pasándole el precio y el IVA, y el método calcula el precio total.
     * - Pasándole solo el precio, entonces considera un IVA estándar del 21% para calcular el total.
     */

    public static void producto (float precio, int iva){
        System.out.println(precio+(precio*iva/100));
    } 

    public static void producto (float precio){
        System.out.println(precio*1.21f);
    }


    public static void main(String[] args) {
        float precio = Float.parseFloat(System.console().readLine("Introduce el precio del producto: "));
        String iva = (System.console().readLine("Introduce el IVA del producto (1) o usa el IVA por defecto (2): "));

        switch (iva) {
            case "1":
                int ivaNum = Integer.parseInt(System.console().readLine("1. IVA 0%  2.IVA 5%  3.IVA 10%"));
                producto(precio, ivaNum);
                break;

            case "2":
            producto(precio);
            break;
        }
        
    }
}
