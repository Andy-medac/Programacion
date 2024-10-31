/* Haz un programa que pregunte al usuario cuánto dinero tiene en el banco.
 * Después el programa debe preguntar cuanto quiere gastar, y hacer las cuentas 
 * necesarias. Después, el programa debe preguntar cuánto quiere ingresar,
 * y hacer las cuentas necesarias. Por último, muestra el dinero final de la cuenta.
*/

public class Ejercicio12 {
    public static void main(String[] args) {
        
        //Inserto el dinero que tengo en la cuenta y creo la variable.
        float dineroCuenta = Float.parseFloat (System.console().readLine("¿Cuánto dinero tiene en la cuenta?") );
        
        //Creo la variable de gastos y se la resto a la primera variable que hemos creado modificándola.
        float gasto = Float.parseFloat(System.console().readLine("¿Cuánto dinero quiere gastar?"));
        dineroCuenta = dineroCuenta - gasto;

        //Creo la variable de ingreso y se lo sumo a la variable anterior modificándola.
        float ingreso = Float.parseFloat(System.console().readLine("¿Cuánto dinero quiere ingresar?"));
        dineroCuenta = dineroCuenta + ingreso;
        

        System.out.println("El dinero total en su cuenta es de " + dineroCuenta);


    }
}
