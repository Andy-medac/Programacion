/*
 * Desarrolla una clase coche que tenga propietario, marca y km. Del propietario debemos saber 
su nombre, dni y nacionalidad.
 */

package com.mycompany.asociacionsimple;

public class AsociacionSimple {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona ("Marta", "92834568K", "Española");
        Coche coche1 = new Coche (persona1, "Nissan", 38734);
        
        System.out.println(coche1);
    }
}
