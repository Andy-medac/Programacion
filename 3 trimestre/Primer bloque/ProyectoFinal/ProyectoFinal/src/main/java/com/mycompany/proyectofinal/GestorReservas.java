package com.mycompany.proyectofinal;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorReservas {

    private ArrayList<Reserva> reservas;

    public GestorReservas() {
        reservas = new ArrayList<>();
    }

    public void añadirReserva(Reserva r) throws ConflictoReservaException {

        if (hayConflicto(r)) {
            throw new ConflictoReservaException("Esta habitacion ya esta reservada.");
        } else {
            reservas.add(r);
            System.out.println("Habitacion reservada correctamente.");
        }
    }

    public boolean hayConflicto(Reserva r) {

        int num = r.getHabitacion().getNumero(); //Recogemos tanto el num de la habitación como la fecha del parámetro
        LocalDate fechaPedida = r.getFecha();

        for (int i = 0; i < reservas.size(); i++) { //recorremos el arrayList de reservas
            Reserva habitacionCogida = reservas.get(i); //Por cada habitación
            int numHabitacion = habitacionCogida.getHabitacion().getNumero();//Recogemos el número y la fecha
            LocalDate fechaReserva = habitacionCogida.getFecha();

            if (num == numHabitacion && fechaReserva.equals(fechaPedida)) { //y comparamos los cuatro valores (2 y 2)
                return true; // En caso de que coincidan, devuelve true
            } 
        }
        return false;
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No existen reservas.");
        } else {
            for (int i = 0; i < reservas.size(); i++) {
                System.out.println(reservas.get(i));
            }
        }
    }
}
