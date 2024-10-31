public class Ejercicio6f {

    public static float calcularMedia(int n1, int n2, int n3){
        return ((n1+n2+n3)/3.0f);
    }
    public static float sumarPunto(float n){
        return n+1;
    }

    public static void main(String[] args) {
        
        int nota1 = Integer.parseInt(System.console().readLine("Introduce una nota: "));
        int nota2 = Integer.parseInt(System.console().readLine("Introduce una nota: "));
        int nota3 = Integer.parseInt(System.console().readLine("Introduce una nota: "));


        float mediaMain = calcularMedia(nota1, nota2, nota3);
        float notaFinal = sumarPunto(mediaMain);
        System.out.println(notaFinal);
    }
}
