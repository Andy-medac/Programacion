public class Ejercicio13 {
    public static void main(String[] args) {
        
        String nombres[] = {"ana", "manuel", "sara", "carla", "daniel"};

        String nomU = System.console().readLine("Cómo te llamas? ");

        for (int i = 0; i < nombres.length; i++) {

          if (nomU.equals(nombres[i])) {
            System.out.println("estás en la lista");
            break;
          }  

          else{
            System.out.println("no estás en la lista");
            break;
          }
        }
        

    }
}
