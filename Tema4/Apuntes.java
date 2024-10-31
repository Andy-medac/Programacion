
    //Hay dos tipos de lenguajes
    //Compilados (primero interpreta todo lo que hay escrito y después lo ejecuta) e interpretados (va línea a línea)
    

public class Apuntes {

    //Método  (función o procedimiento):

    //Definiendo el método      va a recibir una string
    public static void saludar (String palabra1, String palabra2){

        //le digo que añada el string a la frase
        System.out.println("Hola " + palabra1 + " " + palabra2);
        System.out.println("Que tal");

    }

    public static void main(String[] args) {
        
        System.out.println("Voy a ejecutar una función");
        String nombre = System.console().readLine("Introduce tu nombre: "); //indico que el string sea lo que introduzca
        String apellido = System.console().readLine("Introduce tu apellido: ");
        saludar(nombre, apellido); //invocando al  método
       


    }
    //TODO DEBE ESTAR DENTRO DEL EJERCICIO (dentro del public class)
}
