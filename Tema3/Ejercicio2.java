

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int hora = Integer.parseInt(System.console().readLine("Introduce la hora: "));

        if (hora>6 && hora<12){
            System.out.println("Buenos días");
        }

        else if (hora>13 && hora<20){
            System.out.println("Buenas tardes");
        }

        else if (hora>21 && hora<24){
            System.out.println("Buenas noches");
        }
        else if (hora>0 && hora<5){
            System.out.println("Buenas noches");
        }
        //NO ES NECESARIO PONER EL ELSE

        else {
            System.out.println("Esa hora no existe máquina");
        }
    }
}
