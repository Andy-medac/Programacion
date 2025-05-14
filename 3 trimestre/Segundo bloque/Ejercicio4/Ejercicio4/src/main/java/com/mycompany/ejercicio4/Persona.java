package com.mycompany.ejercicio4;

import java.io.Serializable;

public class Persona implements Serializable{ //implementamos la interfaz para la serialización

    private static final long serialVersionUID = 1L; //añadimos su atributo (static para que sea de la clase en sí)
    private String nombre;
    private String dni;

    public Persona(String n, String d) {
        this.nombre = n;
        this.dni = d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}
