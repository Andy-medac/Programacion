/* Conversor de días a horas (el usuario introduce un númeor de días y 
el programa muestra cuántas horas son) */



public class Ejercicio6 {
    
    public static void main(String[] args) {
        
        float dias = Float.parseFloat (System.console().readLine("Introduce el número de días"));
        float horas = dias*24;
        System.out.println(dias + " días son " + horas + " horas.");




    }

}
