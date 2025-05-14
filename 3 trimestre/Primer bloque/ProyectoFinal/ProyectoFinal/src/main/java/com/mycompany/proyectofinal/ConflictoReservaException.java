package com.mycompany.proyectofinal;

// Crear excepción personalizada ConflictoReservaException
public class ConflictoReservaException extends Exception{
    public ConflictoReservaException (String mensaje){
        super(mensaje);
    }
}