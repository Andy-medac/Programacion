public class apuntesBucles {
    public static void main(String[] args) {
        
        
        //Estructura que repite lo que tiene dentro
        
        //Tipo 1: bucle for
        //dentro del paréntesis del for se pone: 
        //1.Creamos la variable y especificamos dónde se va contar
        //2. decimos hasta dónde cuenta
        //3. decimos i++ para que cuente de uno en uno (si fuera de dos en dos sería i=i+2)
        //dentro de lo que hay en las llaves se va a repetir las veces que marque en el paréntesis

        //con break paramos el bucle, y con continue nos saltamos una repetición
        
        for(int i = 0; i<10; i++){ 
            System.out.println("voy por la repetición " + i);
        }
    

        //Tipo 2: bucle while
        //Se va a repetir mientras se cumpla una condición

        int num = 5;

        while(num < 10){
            System.out.println("Hola");
        }
    }
}
