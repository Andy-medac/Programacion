public class crearArray {
    public static void main(String[] args) {
        //podemos crearlo introduciendo nosotros la longitud
        int notas[] = new int[8];

        //O podemos crear el array y perdirle al usuario cuál es la longitud
        int notas1[];
        int longitud = Integer.parseInt(System.console().readLine("Introduce la longuitud: "));
        notas1 = new int[longitud];
        notas1[0] = 2;

        //Introducimos nosotros el dato
        notas[0] = 19;
        //Le pdimos al usuario el dato de la posicion que queramos del array
        notas[1] = Integer.parseInt(System.console().readLine("Introduce un número: "));

        System.out.println(notas[1]);
        System.out.println(notas[2]);

    }
}
