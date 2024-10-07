public class Ejercicio5 {
    public static void main(String[] args) {
        /*Escrube un programa que te pregunte la nota que has sacado en una asignatura y te diga
         * si corresponde a:0-5 suspenso, 5-6 suficiente, 6-7 bien, 7-9 notable y 10 sobresaliente*/

         float nota = Float.parseFloat(System.console().readLine("Introduce tu nota: "));

         if (nota>=0 && nota<5){
            System.out.println("Tienes un suspenso");
         }

         else if (nota>=5 && nota<6) {
            System.out.println("Tienes un suficiente");
         }

         else if (nota>=6 && nota<7) {
            System.out.println("Tienes un bien");
         }

         else if (nota>=7 && nota<9) {
            System.out.println("Tienes un notable");
         }

         //Pueden anidarse los if 
         else if (nota>=9 && nota==10) {
            if (nota==10) {
               System.out.println("Tienes matrícula de honor");
            }
            else {
               System.out.println("Tienes un sobresaliente");
            }
         }

         else {
            System.out.println("No te enteras ni de la nota que tienes machine");
         }
    }
}
