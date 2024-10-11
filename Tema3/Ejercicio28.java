public class Ejercicio28 {
    /*Un bucle que imprime los números del 1 al 100 excepto el que te diga el usuario*/
    
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(System.console().readLine("Introduce el número que debo saltar: "));

        for (int i = 0; i<101; i++) {
            
            //con el continue se salta esa repetición del bucle y continúa con las demás
            //si el número es el 3, se salta la repetición 3 y sigue con las demás
            if (i==numero) {
                continue;
            }

            System.out.print(" " + i + " ");
        }
    }
}
