package com.mycompany.ejercicio5;

public class Alumno {

    private String nombre;
    private String apellidos;
    private double nota;
    private String dni;

    public Alumno(String nombre, String apellidos, double nota, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + ", dni=" + dni + '}';
    }
}
