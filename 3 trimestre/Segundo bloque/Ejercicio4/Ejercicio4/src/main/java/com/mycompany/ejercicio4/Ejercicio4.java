package com.mycompany.ejercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio4 {

    public static void main(String[] args) {

        Persona p1 = new Persona("Ana", "45789325J");

        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.txt"));
            oos.writeObject(p1); //seleccionamos el objeto para que sea escrito
            System.out.println("Persona guardada.");
            oos.close();

        } catch (IOException e) {
            System.out.println("Error con el archivo.");
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.txt")); 
            Persona personaLeida = (Persona) ois.readObject(); //creamos otro objeto para que lea este
            System.out.println(personaLeida); //mostramos el objeto
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error con el archivo.");
        } catch (Exception e) {
            System.out.println("Error desconocido");
        }
    }
}
