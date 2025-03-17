package com.mycompany.ejercicio2;

/**
Crea la superclase Libro, que tenga título, autor y precio y sus métodos habituales. Crea las subclases:
- LibroDeTexto: hereda e incluye además ‘curso’ y 'asignatura'.
- Novela: hereda e incluye además el tipo: romántica, histórica, policiaca, aventuras.
- LibroDivulgativo: incluye área de conocimiento (física, biología, medicina, etc.).
- LibroConsulta: pueden ser diccionarios, enciclopedias y diccionarios de idiomas.
En el main, crea un objeto de cada tipo e imprímelos por consola para comprobar que se han creado correctamente
 */
public class LibroDeTexto extends Libro {
    
    private int curso;
    private String asignatura;
    
    public LibroDeTexto (String titulo, String autor, int precio, int c, String a){
        super(titulo, autor, precio);
        this.curso = c;
        this.asignatura = a;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + " curso: " + this.curso + ", asignatura: " + this.asignatura;
    }
    
    
}
