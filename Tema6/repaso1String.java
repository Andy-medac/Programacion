public class repaso1String {

    /*
     * Supongamos que se consideran números de la suerte los números: 0,1,2,5,7, y
     * números de la mala suerte: 3,4,6,8,9. Desarrolla un programa que, dado un
     * número introducido por el usuario, diga si da buena suerte o no, en función
     * de si tiene más números de buena suerte o de mala suerte.
     */
    public static void main(String[] args) {

        String buena[]= {"0", "1", "2", "5", "7"};
        String mala[] = {"3", "4", "6", "8", "9"};
        String numU = System.console().readLine("Introduce un número: ");

        for (int i = 0; i < mala.length; i++) {

            if (numU.equals(buena[i])) {
                System.out.println("Tienes buena suerte!");
            }

            else if (numU.equals(mala[i])) {
                System.out.println("Tienes mala suerte :(");
            }
        }

        
    }
}
