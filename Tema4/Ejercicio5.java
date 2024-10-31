public class Ejercicio5 {
    
/*Desarrola un programa que muestre un menú al usuario con las siguientes opciones:
 * - Pasar de segundos a horas, minutos y segundos. (4250s= 1h, 10min, 50s.)
 * - Pasar de minutos a horas y minutos. (75min= 1h y 15min.)
 */

    public static void segundos (int seg){
        int horas = seg/3600;
        int segundos = seg%3600;
        int minutos = segundos/60;

        System.out.println(seg +"s = " + horas + "horas, "+ minutos + "min y " + segundos + "s." );
        }

    public static void minutos(int min) {
        int horas = min/60;
        int minutitos = min%60;
        System.out.println(min + "min = " + horas + "h y " + minutitos + "min." );
    }

    public static void main(String[] args) {
        
        int modo = Integer.parseInt(System.console().readLine("De segundos a horas (1) o de horas a segundos (2)?: "));

        switch (modo) {
            case 1:
                int segU = Integer.parseInt(System.console().readLine("Introduce los segundos: "));
                segundos(segU);
                break;

            case 2: 
                int horasU = Integer.parseInt(System.console().readLine("Introduce los minutos: "));
                minutos(horasU);
                break;
        
            default:
                break;
        }
    }

}
