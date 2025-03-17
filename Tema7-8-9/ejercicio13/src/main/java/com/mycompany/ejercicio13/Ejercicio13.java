/*
Los libros tienen un título, un autor, una editorial y un código, además de un estado (libre o reservado).

De los autores se debe conocer su nombre y su nacionalidad.

De las editoriales se debe conocer su nombre, el país y la cantidad de libros publicados.

Las acciones que se pueden realizar con un libro son reservarlo y devolverlo. Evidentemente, 
si un libro ya está reservado no puede reservarse, y si un libro no está reservado no puede devolverse.

En el main crea 5 libros y muéstralos por consola. El usuario debe poder elegir cuál quiere reservar, y 
por consola solo se mostrará si se ha podido reservar (porque estaba libre) o si no.
 */

package com.mycompany.ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        Autor autor1 = new Autor ("Haruki Murakami", "Japones");
        Autor autor2 = new Autor ("Dazai Osamu", "Japones");
        
        Editorial editorial1 = new Editorial ("Planeta", "Española", 237);
        Editorial editorial2 = new Editorial ("Kodansha", "Japonesa", 923);
        
        Libro libro1 = new Libro ("Tokio Blues", autor1, editorial2, 193, true);
        Libro libro2 = new Libro ("Kafka en la orilla", autor1, editorial1, 3, false);
        Libro libro3 = new Libro ("1Q84", autor1, editorial2, 19, true);
        Libro libro4 = new Libro ("Indigno de ser humano", autor2, editorial2, 342, true);
        Libro libro5 = new Libro ("Recuerdos", autor2, editorial1, 1, false);
        
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(libro4);
        System.out.println(libro5);
        
        libro1.imprimirReservarDevolver();

        
    }
}
