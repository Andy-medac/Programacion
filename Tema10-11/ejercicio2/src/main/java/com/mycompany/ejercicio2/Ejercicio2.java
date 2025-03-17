package com.mycompany.ejercicio2;

/**
Crea la superclase Libro, que tenga título, autor y precio y sus métodos habituales. Crea las subclases:
- LibroDeTexto: hereda e incluye además ‘curso’ y 'asignatura'.
- Novela: hereda e incluye además el tipo: romántica, histórica, policiaca, aventuras.
- LibroDivulgativo: incluye área de conocimiento (física, biología, medicina, etc.).
- LibroConsulta: pueden ser diccionarios, enciclopedias y diccionarios de idiomas.
En el main, crea un objeto de cada tipo e imprímelos por consola para comprobar que se han creado correctamente
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        LibroDeTexto libro1 = new LibroDeTexto ("Matematicas aplicadas", "Santillana", 40, 3, "Matematicas" );
        Novela libro2 = new Novela ("El hombre invisible", "Antonio Machado", 20, TipoNovela.romantica);
        LibroDivulgativo libro3 = new LibroDivulgativo ("La medicina para el alma", "Escuela de enfermeria", 18, TipoDivulgativo.medicina);
        LibroConsulta libro4 = new LibroConsulta ("Diccionario RAE", "RAE", 10, TipoConsulta.diccionario);
        
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
    }
}
