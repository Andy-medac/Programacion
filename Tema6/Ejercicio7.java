public class Ejercicio7 {

    /*
     * Programa que pida la temperatura media que ha hecho en cada mes de un
     * determinado
     * año (estos datos los va introduciendo el usuario y se guardan en un array) .
     * El programa debe ir indicando el mes, por ejemplo:
     * 
     * "Introduce la temperatura media de enero"
     * 
     * Una vez preguntados todos los meses, el programa debe mostrar un diagrama de
     * barras
     * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
     * de asteriscos
     * o cualquier otro carácter. El diagrama mostrado debería ser algo así:
     * 
     * [ENE] ***********
     * [FEB] *************
     * [MAR] ******************
     * [ABR] ********************
     * [MAY] *****************************
     * [JUN] ********************************
     * [JUL] *************************************
     * [AGO] ******************************************
     * [SEP] **************************
     * [OCT] **************
     * [NOV] ********
     * [DIC] *****
     */

    public static void main(String[] args) {

        //Creo dos arrays para las temperaturas y los meses
        String meses[] = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };

        int temperatura[] = new int[12];

        //Pregunto las temperaturas de cada mes
        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = Integer
                    .parseInt(System.console().readLine("Introduce la temperatura media de " + meses[i] + ": "));
        }

        //Muestro los asteriscos por cada mes
        for (int i = 0; i < meses.length; i++) { //Bucle para pasar por cada mes

            System.out.print("[" + meses[i] + "] ");

            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
