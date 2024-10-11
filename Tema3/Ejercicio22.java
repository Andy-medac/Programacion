public class Ejercicio22 {
    public static void main(String[] args) {
        //Programa que pregunte un saludo al usuario y le pregunte cuántas veces quiere repetirlo.
        //el programa repetirá el saludo las veces que se haya indicado

        String saludo = System.console().readLine("Introduce tu saludo: ");
        int veces = Integer.parseInt(System.console().readLine("Cuántas veces quieres que te salude? "));
    
        for (int i = 0; i<veces; i++){
            System.out.println(saludo);
        }
    }
}
