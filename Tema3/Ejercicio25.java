public class Ejercicio25 {
    public static void main(String[] args) {
        //Programa que pregunte una frase y la repite. El programa va a repetir la frase 100 veces, 
        //pero una de las veces que escribas la palabra para, termina el programa.

        String frase = "";
        
        for (int i= 0; i<100; i++){
            frase = System.console().readLine("introduce una frase: ");
            
            

            //En este caso el break rompe el bucle.
            if (frase.equals("para")){
                break;
            }
            else {
                System.out.println(frase);
            }
        }
    }
}
