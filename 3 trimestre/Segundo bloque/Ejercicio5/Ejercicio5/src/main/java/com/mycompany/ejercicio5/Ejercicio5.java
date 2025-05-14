package com.mycompany.ejercicio5;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.*;

import java.io.File;
import java.util.ArrayList;

public class Ejercicio5 {

    public static void main(String[] args) {

        //Lista de alumnos donde se cargarán todos los que se lean del XML
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        try {
            //Cargamos el fichero
            File archivo = new File("alumnos.xml");

            //Creamos los objetos necesarios de Java para cargar XML y leerlos
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(archivo);
            doc.getDocumentElement().normalize();

            //Creamos una lista de tipo NodeList donde se cargarán los datos y podremos recorrer
            NodeList lista = doc.getElementsByTagName("alumno");

            //Recorremos cada nodo de la lista (cada alumno, en este caso)
            for (int i = 0; i < lista.getLength(); i++) {
                Node nodo = lista.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;

                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent(); //Cargamos el nombre
                    String apellidos = elemento.getElementsByTagName("apellidos").item(0).getTextContent(); 
                    String dni = elemento.getElementsByTagName("dni").item(0).getTextContent(); 
                    double nota = Double.parseDouble(elemento.getElementsByTagName("nota").item(0).getTextContent()); //Cargamos la nota
                    
                    // Crear objeto Alumno y añadirlo a la lista
                    Alumno alumno = new Alumno(nombre, apellidos, nota, dni);
                    listaAlumnos.add(alumno);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer XML: " + e.getMessage());
        }

        // Podríamos ahora mostrar los alumnos recorriendo la lista
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i));
        }
    }
}
