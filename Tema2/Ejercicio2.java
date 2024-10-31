public class Ejercicio2 {

    /*Desarrolla un programa que pregunte al usuario su año de nacimiento y su nombre 
    y después muestre por consola el mombre y cuántos años tiene esa persona */

    public static void main(String[] args) {
        
        //Nos pregunta el nombre y el año
        String nombre = System.console().readLine("¿Cuál es tu nombre?");
        String fechaNacimiento = System.console().readLine("¿Cuándo naciste?");

        //Convertimos el año de nacimiento en un número y hago el cálculo de la edad.
        int edad = Integer.parseInt(fechaNacimiento); 
        int edadFinal = (2024 - edad);
        

        System.out.println("Hola " + nombre + " tienes " + edadFinal + " años.");








    }
}
