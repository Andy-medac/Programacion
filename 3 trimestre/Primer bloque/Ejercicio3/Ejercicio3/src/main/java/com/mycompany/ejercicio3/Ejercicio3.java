package com.mycompany.ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Marta Gonzalez");
        double cantidad = 0;
        int opcion = 0;

        while (true) {
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");

            try {
                opcion = Integer.parseInt(System.console().readLine("Elige una opcion: "));

                switch (opcion) {
                    case 1:
                        cantidad = Integer.parseInt(System.console().readLine("Cuanto dinero desea ingresar? "));
                        c1.ingresar1(cantidad);
                        break;
                    case 2:
                        cantidad = Integer.parseInt(System.console().readLine("Cuanto dinero desea retirar? "));
                        c1.retirar1(cantidad);
                        break;
                    case 3:
                        System.out.println(c1.consultarSaldo());
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número.");
            }
            /*EN EL CASO DE USAR LOS MÉTODOS QUE REQUIERAN DEL TRY EN EL MAIN (retirar2, ingresar2), AQUÍ VAN LOS CATCH*/
        }
    }
}
