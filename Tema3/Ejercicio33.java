public class Ejercicio33 {

    /*Ejercicio 33. Crea un programa que genere un número aleatorio entre 1 y 100 y 
     * pida al usuario que lo adivine. El programa debe seguir preguntando una
     * y otra vez hasta que el usuario realmente lo acierte (sin número máximo de intentos).
     * Tras cada pregunta, irá diciendo si el número buscado es mayor o menor que el introducido, 
     * para dar pistas al usuario.*/
    
        public static void main(String[] args) {
            
            int num = (int) (Math.random()*100+1);
            
            
            while (true) { 
            int numUsuario = Integer.parseInt(System.console().readLine("Introduce un número del 1 al 100: "));  

                if (num<numUsuario){
                    System.out.println("No acertaste, el número es menor que el que introduciste.");
                }
    
                else if (num>numUsuario) {
                    System.out.println("No acertaste, el número es mayor que el que introduciste.");
                }

                else if (num==numUsuario) {
                    System.out.println("Acertaste!");
                }

                else {
                System.out.println("Error");
                break;
                }
            } 
    
        }
    }
    
    
    