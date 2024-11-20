public class Ejercicio2 {
    public static void main(String[] args) {
        
        int notas[];

        int longitud = Integer.parseInt(System.console().readLine("Introduce el número de notas: ")); 
        notas = new int[longitud];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Integer.parseInt(System.console().readLine("Introduce una nota: "));
        }

        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        float media = (float)suma / (float)longitud;

        System.out.println("La media es de " + media);


    }
}
