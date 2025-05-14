package com.mycompany.proyectofinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProyectoFinal {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        try {
            // creamos un array donde se almacenarán productos

            String linea;
            //creamos el bufferedreader para leer cada linea del txt
            BufferedReader br = new BufferedReader(new FileReader("productos.txt"));

            while ((linea = br.readLine()) != null) { // mientras que la linea no sea null

                String[] separadas = linea.split(","); //creo un array donde se almacenará el contenido separado por ,
                String nombre = separadas[0];
                String categoria = separadas[1];
                double precio = Double.parseDouble(separadas[2]); //cada posicion es un atributo distinto del producto
                int stock = Integer.parseInt(separadas[3]);

                Producto p1 = new Producto(nombre, categoria, precio, stock); //creo un producto con esos atributos
                productos.add(p1); //lo añado al array de productos
            }

            br.close();
            
            //mostramos el array
            for (int i = 0; i < productos.size(); i++) {
                System.out.println(productos.get(i));
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el fichero.");
        } catch (IOException e) {
            System.out.println("Error con el fichero.");
        } catch (NumberFormatException e) {
            System.out.println("Alguno de los datos no es un numero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error con el array.");
        } catch (Exception e) {
            System.out.println("Error desconocido.");
        }
    }
}
