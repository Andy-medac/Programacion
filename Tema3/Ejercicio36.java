public class Ejercicio36 {
    /* Programa que te pide que cantidad quieres invertir, el interés anual y el número de años, 
     * y te devuelve la cantidad ganada cada año.
     * (Por ejemplo, un 10%v de beneficio pero siempre con respecto a la cantidad que tienes del año anterior)
     */
    public static void main(String[] args) {
        
        float cantidad = Float.parseFloat(System.console().readLine("Cantidad a invertir: "));
        float interes = Float.parseFloat(System.console().readLine("Interés anual : "));
        float años = Float.parseFloat(System.console().readLine("Años: "));
        
        float total = (float) cantidad;
        
        for (int i = 0; i<años; i++ ){
            
            System.out.println("Año " + i + ": " + total + " euros.");
            total = total + (total*(interes/100f));
           
            

        }
    }
}
