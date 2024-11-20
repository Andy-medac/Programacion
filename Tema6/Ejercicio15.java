public class Ejercicio15 {

    /*
     * Programa notas asignaturas:
     * 
     * Durante el curso escolar, un alumno se examina de cada asignatura una vez en
     * cada trimestre,
     * por lo que acaba teniendo 3 notas de cada asignatura.
     * 
     * Desarrolla un programa que pida al alumno sus 3 notas de cada una de sus
     * asignaruras y devuelva:
     * 
     * - La nota final de cada asignatura (la media de las 3 notas)
     * - La nota media final del curso (media)
     * 
     * [podemos simplificar a 4 o 5 asignaturas]
     */

    public static void main(String[] args) {

        int notas[][] = new int[4][3];
        String asignatura[] = { "BBDD", "LLMM", "EEDD", "Programación" };
        int mediaA[] = new int[4];
        int media = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = Integer
                        .parseInt(System.console().readLine("Introduce tu nota de " + asignatura[i] + ": "));
            }
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                mediaA[i] += notas[i][j];
            }
            mediaA[i] = mediaA[i] / 3;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("La media de " + asignatura[i] + " es: " + mediaA[i]);
            System.out.println(" ");
        }

        for (int i = 0; i < notas.length; i++) {
            media += mediaA[i] / 4;            
        }
        System.out.println("La media final del curso es de: " + media);
    }
}
