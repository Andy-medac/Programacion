public class Ejercicio4 {

/*Desarrolla un programa que introducioendo el número de día de la semana, te diga qué diás es */

    public static void main(String[] args) {
        int diaNum = Integer.parseInt(System.console().readLine("¿Qué día de la semana en número es hoy? "));

        //PARA USAR EL SIGNO = PARA INDICAR QUE ES IGUAL QUE, SE USA ==.
        if (diaNum == 1){
            System.out.println("Es lunes");
        }

        else if (diaNum == 2){
            System.out.println("Es martes");
        }

        else if (diaNum == 3){
            System.out.println("Es miércoles");
        }

        else if (diaNum ==4) {
            System.out.println("Es jueves");
        }

        else if (diaNum ==5){
            System.out.println("Es viernes");
        }

        else if (diaNum ==6){
            System.out.println("Es sábado");
        }

        else {
            System.out.println("Es domingo");
        }
    }
}