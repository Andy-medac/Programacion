/* Desarrolla un programa que pregunte al usuario cuántas calorías 
ha ingerido en el desayuno. Después, debe preguntar cuántas
calorías ha ingerido en el almuerzo. Después, debe preguntar cuántas 
calorías ha ingerido en la cena. Por último, el programa finaliza mostrando 
las calorías totales ingeridas en el día.*/

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        //Creo una variable 
         int caloriasTotal = 0;


        //Inserto las calorías y se las sumo a la variable creada
        int caloriasDesayuno = Integer.parseInt(System.console().readLine("¿Cuántas calorías ingeriste en el desayuno? "));
        caloriasTotal = caloriasDesayuno + caloriasTotal;
        System.out.println("LLevas un total de " + caloriasTotal + " calorías.");

        int caloriasAlmuerzo = Integer.parseInt(System.console().readLine("¿Cuántas calorías ingeriste en el almuerzo? "));
        caloriasTotal = caloriasAlmuerzo + caloriasTotal;
        System.out.println("LLevas un total de " + caloriasTotal + " calorías.");

        int caloriasCena = Integer.parseInt(System.console().readLine("¿Cuántas calorías ingeriste en la cena? "));
        caloriasTotal = caloriasCena + caloriasTotal;
        

        //Por último muestro por consola las calorías totales.
        System.out.println("La cantidad final de calorías ingeridas hoy es de: " + caloriasTotal );

    }
}
