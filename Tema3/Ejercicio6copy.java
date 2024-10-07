public class Ejercicio6copy {
    public static void main(String[] args) {
        /*
         * Desarrolla un programa que te calcule tu horoscopo según tu fecha de
         * nacimiento
         * 
         * || or
         * && and
         * AL USAR STRING EN EL IF, DEBEMOS USAR EN LA CONDICION variable.equals
         * 
         * 
         */
        String mes = System.console().readLine("Introduce tu mes de nacimiento ");

        if (mes.equals ("enero") || mes.equals("1")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 19) {
                System.out.println("Eres capricornio");
            } 
            
            else if (dia >= 20 && dia <= 31) {
                System.out.println("Eres acuario");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("febrero") || mes.equals("2")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 18) {
                System.out.println("Eres acuario");
            } 
            
            else if (dia >= 19 && dia <= 28) {
                System.out.println("Eres piscis");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("marzo") || mes.equals("3")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 20) {
                System.out.println("Eres piscis");
            } 
            
            else if (dia >= 21 && dia <= 31) {
                System.out.println("Eres Aries");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("abril") || mes.equals("4")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 19) {
                System.out.println("Eres aries");
            } 
            
            else if (dia >= 20 && dia <= 30) {
                System.out.println("Eres tauro");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("mayo") || mes.equals("5")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 20) {
                System.out.println("Eres tauro");
            } 
            
            else if (dia >= 21 && dia <= 31) {
                System.out.println("Eres géminis");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("junio") || mes.equals("6")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 20) {
                System.out.println("Eres géminis");
            } 
            
            else if (dia >= 21 && dia <= 30) {
                System.out.println("Eres cáncer");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("julio") || mes.equals("7")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 22) {
                System.out.println("Eres cáncer");
            } 
            
            else if (dia >= 23 && dia <= 31) {
                System.out.println("Eres leo");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("agosto") || mes.equals("8")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 22) {
                System.out.println("Eres leo");
            } 
            
            else if (dia >= 23 && dia <= 31) {
                System.out.println("Eres virgo");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("septiembre") || mes.equals("9")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 22) {
                System.out.println("Eres virgo");
            } 
            
            else if (dia >= 23 && dia <= 30) {
                System.out.println("Eres libra");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("octubre") || mes.equals("10")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 22) {
                System.out.println("Eres libra");
            } 
            
            else if (dia >= 23 && dia <= 31) {
                System.out.println("Eres escorpio");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("noviembre") || mes.equals("11")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 21) {
                System.out.println("Eres escorpio");
            } 
            
            else if (dia >= 22 && dia <= 30) {
                System.out.println("Eres sagitario");
            } 
            
            else {
                System.out.println("No existes");
            }
        }

        else if (mes.equals ("diciembre") || mes.equals("12")) {
            int dia = Integer.parseInt(System.console().readLine("Introduce tu día de nacimiento "));
            if (dia >= 1 && dia <= 21) {
                System.out.println("Eres sagitario");
            } 
            
            else if (dia >= 22 && dia <= 31) {
                System.out.println("Eres capricornio");
            } 
            
            else {
                System.out.println("No existes");
            }

            
        }
        
        else {
           System.out.println("No existes");     
        }
    }
}
