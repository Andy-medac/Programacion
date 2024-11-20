public class Ejercicio1bucles {

    public static void imprimirNumeros(int n){
        
        if (n<=0) {
            System.out.println("Finalizó la cuenta atrás");
        }

        else{
            System.out.println(n);
            imprimirNumeros(n-1);
        }
    }

    public static void main(String[] args) {
       
        int numU = Integer.parseInt(System.console().readLine("Introduce un número: "));
        
        imprimirNumeros(numU);
    }
}
