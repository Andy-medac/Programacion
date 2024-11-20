//Estructuras de almacenamiento: arrays

public class asignarArray {

    public static void main(String[] args) {

        //Los corchetes indican que vamos a asignar un conjunto de valores 
        //array de int de longuitud 7, posiciones (0-6)
        int notas[] = {6, 4, 7, 9, 2, 3, 10};

        //Indicamos el valor que queremos imprimir (0 - ∞)
        //Consultar un valor
        System.out.println(notas[0]);

        //Podemos modificar el valor
        notas[2] = 1;
        System.out.println(notas[2]);

        //Para imprimir todos los valores a la vez usamos un bucle (fori)
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            System.out.println("Posición " + i + ": " + notas[i]);
        }

    }


}