public class Ejercicio35 {
    /*Programa que simule una cuenta bancaria. El usuario puede introducir si desea ingresar o retirar dinero, y qué cantidad
     * EL programa sigue ejecutandose hasta que el saldo sea menos de 0€
     */
    public static void main(String[] args) {
        int banco = 0;
        int ingreso = 0;
        int retirada = 0;
        String operacion; 

        do {

            operacion = System.console().readLine("Quieres ingresar o retirar dinero? ");

            if (operacion.equals("ingresar")) {
                 ingreso = Integer.parseInt(System.console().readLine("Cuánto quieres ingresar? "));
                banco += ingreso;
                System.out.println("Tienes " + banco + " euros.");
            }

            else if (operacion.equals("retirar")) {
                 retirada = Integer.parseInt(System.console().readLine("Cuánto quieres retirar? "));
                banco -= retirada;
                System.out.println("Tienes " + banco + " euros.");
            }   
            
        } while (banco >= 0);

        System.out.println("Tu cuenta está en números rojos.");
    }
}
