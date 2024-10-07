public class Ejercicio16 {
    public static void main(String[] args) {
        /*
     * Ruleta
     * Bienvenido/a al casino Medac
     * Cuántos años tienes (Si tiene 18 o más, juega, si no finaliza el programa)
     * 
     * A qué quieres apostar:
     * Según a lo que apueste, muestra las opciones aleatorias de cada cual
     * - Colores (Rojo, negro o verde)
     * - Número (0 - 36 incluidos)
     * - Secciones (1, 2 o 3)
     * - Par o impar
     */
      System.out.println("Bienvenido al casino joeputa");

     String edad = System.console().readLine("¿Eres mayor de edad? ");

     if (edad.equals("No")) {
        System.out.println("No puedes jugar");
     }

     else if (edad.equals("si")) {
        System.out.println("1. Colores");
        System.out.println("2. Números (0-36)");
        System.out.println("3. Secciones");
        System.out.println("4. Par o impar");
         int categoria = Integer.parseInt(System.console().readLine("Introduce el número de la categoría a la que quieres jugar: "));

        switch (categoria) {
         case 1:
            String color = System.console().readLine("Introduce el color al que quieres apostar: ");
            int numeroColores = (int) (Math.random()*3+1);
            
            switch (numeroColores) {
               case 1:
                  System.out.println("Ha salido el color rojo");
                  if (color.equals("rojo")) {
                     System.out.println("Has ganado oleee");
                  }
                  else {
                     System.out.println("Perdiste, de vuelta a la cueva");
                  }
                  break;
            
               case 2:
                  System.out.println("Ha salido el color negro");
                  if (color.equals("negro")) {
                     System.out.println("Has ganado oleee");
                  }
                  
                  else {
                     System.out.println("Perdiste, de vuelta a la cueva");
                  }
                  break;

               case 3:
                  System.out.println("Ha salido el color verde");
                  if (color.equals("verde")) {
                     System.out.println("Has ganado oleee");
                  }

                  else  {
                     System.out.println("Perdiste, de vuelta a la cueva");
                  }
                  break;
            }
            
         case 2:
         int numero = Integer.parseInt(System.console().readLine("Introduce el número al que quieres apostar: "));
         int numeroNumero = (int) (Math.random()*37);
            
            System.out.println("Ha salido el número " + numeroNumero);
            if (numero == numeroNumero) {
               System.out.println("Has ganado oleeee");
            }
            
            else {
               System.out.println("Perdiste, de vuelta a la cueva");
            }
            break;


         case 3:
         System.out.println("Sección 1: 0-12");
         System.out.println("Sección 2: 13-25");
         System.out.println("Sección 3: 26-36");
         int seccion = Integer.parseInt(System.console().readLine("Introduce el número de sección a la que quieres apostar: "));
         int numeroSeccion = (int) (Math.random()*3+1);
            System.out.println("Ha salido la sección " + numeroSeccion);
            if (seccion == numeroSeccion) {
               System.out.println("Has ganado oleee");
            }

            else {
               System.out.println("Perdiste, de vuelta a la cueva");
            }
            break;

         case 4:
         String parImpar = System.console().readLine("Introduce si el número va a ser par o impar: ");
         int numeroParImpar = (int) (Math.random()*2+1);
            
            switch (numeroParImpar) {
               case 1:
                  System.out.println("Ha salido un número par");
                  if (parImpar.equals("par")) {
                     System.out.println("Has ganado oleee");
                  }

                  else {
                     System.out.println("Perdiste, de vuelta a la cueva");
                  }

                  break;

               case 2: 
                  System.out.println("Ha salido un número impar");
                  if (parImpar.equals("impar")) {
                     System.out.println("Has ganado oleee");
                  }
   
                  else {
                     System.out.println("Perdiste, de vuelta a la cueva");
                  }
                             
               }      

               default:
               System.out.println("Respuesta incorrecta");
               break;
         
            } 
               
         }

      else {
            System.out.println("Respuesta incorrecta");
      }

   }
}
    
   
