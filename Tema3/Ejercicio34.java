public class Ejercicio34 {
    /*Pide al usuario caracteres uno por uno y cuenta cuántas vocales y consonantes ha introducido
     El bucle termina cuando el usuario introduce un 0*/
    public static void main(String[] args) {
        
        
        String letraUsuario ="";
        int vocales = 0;
        int consonantes = 0;

        while (letraUsuario != "0"){
            letraUsuario = System.console().readLine("Introduce una letra: "); 

            if (letraUsuario.equals("a") || letraUsuario.equals("e") || letraUsuario.equals("i") || letraUsuario.equals("o") || letraUsuario.equals("u")) {
                vocales += 1;
            }


            else if (letraUsuario.equals("0")) {
                break;
            }
            
            else {
                consonantes += 1;
            }

        } 
        
        System.out.println("El número de vocales que has introducido es " + vocales);
        System.out.println("El número que has introducido de consonantes es " + consonantes);



    }
}
