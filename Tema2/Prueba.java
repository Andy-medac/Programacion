public class Prueba {
    public static void main(String[] args) {
        
        float peso = Float.parseFloat(System.console().readLine("Introduce tu peso corporal: "));
        float altura = Float.parseFloat(System.console().readLine("Introduce tu altura: "));

        float IMC = peso/(altura*altura);

        System.out.println("Tu IMC es de " + IMC);
    }
}
/*  Desarrolla un programa que calcule el IMC de una persona (índice de masa corporal) tras preguntarle su peso y su altura.*/