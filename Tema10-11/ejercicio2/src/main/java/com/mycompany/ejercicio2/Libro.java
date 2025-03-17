package com.mycompany.ejercicio2;

/**
Crea la superclase Libro, que tenga título, autor y precio y sus métodos habituales. Crea las subclases:
- LibroDeTexto: hereda e incluye además ‘curso’ y 'asignatura'.
- Novela: hereda e incluye además el tipo: romántica, histórica, policiaca, aventuras.
- LibroDivulgativo: incluye área de conocimiento (física, biología, medicina, etc.).
- LibroConsulta: pueden ser diccionarios, enciclopedias y diccionarios de idiomas.
En el main, crea un objeto de cada tipo e imprímelos por consola para comprobar que se han creado correctamente
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int precio;
    
    public Libro(String t, String a, int p){
        this.titulo = t;
        this.autor = a;
        this.precio = p;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "titulo: " + this.titulo + ", autor: " + this.autor + ", precio: " + this.precio;
    }
}
