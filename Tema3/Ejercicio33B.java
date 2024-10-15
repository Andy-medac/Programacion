public class Ejercicio33B {
    public static void main(String[] args) {
        int num = (int) (Math.random()*100+1);
        int numUsuario;
        
        do {
            numUsuario = Integer.parseInt(System.console().readLine("Introduce un número del 1 al 100: ")); 

            if (num<numUsuario){
                System.out.println("No acertaste, el número es menor que el que introduciste.");
            }

            else if (num>numUsuario) {
                System.out.println("No acertaste, el número es mayor que el que introduciste.");
            }

        } while (num != numUsuario);

        System.out.println("Acertaste!");
    } 
}

