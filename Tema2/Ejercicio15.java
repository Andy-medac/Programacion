/* Desarrolla un programa que pregunte al usuario un número de minutos y 
muestre por consola cuantas horas y min son ej: 125 min son 2h y 5 min*/

public class Ejercicio15 {
   
    public static void main(String[] args) {
        

        int minutos = Integer.parseInt(System.console().readLine("Introduce los minutos:"));

        final int hora = 60;
    

        int horaFinal = minutos/hora;
        int minutosFinal = minutos%hora;

        System.out.println( minutos + " minutos son " + horaFinal + " horas y " + minutosFinal + " minutos.");
    }
}
