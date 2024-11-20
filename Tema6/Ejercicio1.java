public class Ejercicio1 {
    
    /* Crea un array con todas las asignaturas */

    public static void main(String[] args) {
        
        String asignaturas[] = new String[8];

        asignaturas[0] = "Programación";
        asignaturas[1] = "EEDD";
        asignaturas[2] = "BBDD";
        asignaturas[3] = "SSII";
        asignaturas[4] = "Digitalización";
        asignaturas[5] = "LLMM";
        asignaturas[6] = "IPE";
        asignaturas[7] = "Sostenibilidad";

        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Asignatura " + i + ": " + asignaturas[i]);
        }

    }
}
