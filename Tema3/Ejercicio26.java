public class Ejercicio26 {
    public static void main(String[] args) {
        //Programa que pide una contraseña y te dice si has acertado. tienes 3 intentos. si te equivocas pasa al
         //segundo intento y si finalizas los intentos se acaba el programa. si aciertas, te dice que has acertado y no te pregunta más.
    
        String contrasena = "devoralolis";
        String intento = "";

        for (int i = 0; i<3; i++){
             intento = System.console().readLine("Introduce la contraseña: ");

            if (contrasena.equals(intento)) {
                System.out.println("Acertaste");
                break;
            }

            else {
                System.out.println("Contraseña incorrecta");
                
            }
            

        }
        
        }
}
