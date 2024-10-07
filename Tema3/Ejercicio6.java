public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * Desarrolla un programa que te calcule tu horoscopo según tu fecha de
         * nacimiento
         */
        int mes = Integer.parseInt(System.console().readLine("Introduce tu mes de nacimiento "));

        if (mes == 1) {
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

        else if (mes == 2) {
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

        else if (mes == 3) {
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

        else if (mes == 4) {
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

        else if (mes == 5) {
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

        else if (mes == 6) {
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

        else if (mes == 7) {
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

        else if (mes == 8) {
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

        else if (mes == 9) {
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

        else if (mes == 10) {
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

        else if (mes == 11) {
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

        else if (mes == 12) {
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
