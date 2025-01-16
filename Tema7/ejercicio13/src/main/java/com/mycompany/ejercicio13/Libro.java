package com.mycompany.ejercicio13;

public class Libro {
    private String titulo;
    private Autor autor;
    private Editorial editorial;
    private int codigo;
    private boolean estado;
    
    //constructor
    public Libro(String t, Autor a, Editorial e, int c, boolean es){
        this.titulo = t;
        this.autor = a;
        this.editorial = e;
        this.codigo = c;
        this.estado = es;
    }
    
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isEstado() {
        return estado;
    }
    
    //Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String imprimirReservarDevolver() {
        
        String eleccion = System.console().readLine("Quieres devolver o reservar el libro " + this.titulo + "? ");
        
        if ("devolver".equalsIgnoreCase(eleccion)) {
        if (estado) { // si el libro está reservado
            estado = false; // cambia el estado a no reservado
            return "Libro devuelto correctamente.";
        } else {
            return "No puedes devolver este libro porque no está reservado.";
        }
    }
        else if ("reservar".equalsIgnoreCase(eleccion)) {
        if (estado) { // si el libro ya está reservado
            return "No puedes reservar este libro porque ya está reservado.";
        } else {
            estado = true; // cambia el estado a reservado
            return "Libro reservado correctamente.";
        }
    }

    else {
        return "Opción no válida. Por favor, escribe 'devolver' o 'reservar'.";
        }
    }

    public String toString() {
        if (estado ==true) {
                 return "titulo: " + this.titulo + ", autor: " + this.autor.getNombre() + ", editorial: " + this.editorial.getNombre() + ", codigo: " + this.codigo + ", estado: reservado}";
        }
        else{
            return "titulo: " + this.titulo + ", autor: " + this.autor.getNombre() + ", editorial: " + this.editorial.getNombre() + ", codigo: " + this.codigo + ", estado: libre}";
        }    
      
    }
    
}
