public class Ejercicio1 {

    public static void main(String[] args) {
     
        /* Desarrolla un programa que primero pregunte al usuario sus notas de  1ºDam y 
        muestre una especie de boletín de notas por consola*/

        //Primero me pregunta las notas y cuando responda las guarda. También convertimos el texto a número.
        String programacion = System.console().readLine("¿Que nota sacaste en programación?");
        float notaProgramacion = Integer.parseInt(programacion);
        String BBDD = System.console().readLine("¿Que nota sacaste en BBDD?");
        float notaBBDD = Integer.parseInt(BBDD);
        String sostenibilidad = System.console().readLine("¿Que nota sacaste en Sostenibilidad?");
        float notaSostenibilidad = Integer.parseInt(sostenibilidad);
        

        //Calculamos la media (+, -, *, /)
        float mediaNotas = (notaProgramacion + notaBBDD + notaSostenibilidad) / 3;

        //Después nos muestra el boletín de notas con las variables que se han guardado anteriormente.
        System.out.println("Tus notas de 1º de Dam");
        System.out.println("-----------------------");
        System.out.println( "Programación: " + programacion);
        System.out.println( "BBDD: " + BBDD);
        System.out.println( "Sostenibilidad: " + sostenibilidad);
        System.out.println("");
        System.out.println("Tu nota media es un " + mediaNotas + ", enhorabuena máquina");
        System.out.println("-----------------------");

        
        //En el sout podemos dejarlo vacío, así nos mostrará una línea en blanco que puede servir de separación.
    }
}
