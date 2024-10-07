public class Ejercicio13 {
    public static void main(String[] args) {
        /*Calculador de nómina. Programa que te pide nº de horas semanales y calcula tu nómina semanal,
        teniendo en cuenta que las primeras 40h se cobran a 10€ y las siguientes a 12€*/

        int horas = Integer.parseInt(System.console().readLine("Introduce el número de horas semanales trabajadas "));
        int nomina = 0;

        if (horas <= 40) {
            nomina = horas *10;
            System.out.println("Tu nómina semanal es de " + nomina + " euros.");
        }
        else if (horas >40) {
            int horasExtra = horas - 40;
            horas = (horasExtra*12) + (40*10);
            nomina = horas;

            System.out.println("Tu nómina semanal es de " + nomina + " euros.");
        }
    }
}
