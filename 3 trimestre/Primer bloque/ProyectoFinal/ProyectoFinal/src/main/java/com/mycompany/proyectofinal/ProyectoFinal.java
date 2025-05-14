package com.mycompany.proyectofinal;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) throws ConflictoReservaException {

        GestorReservas gestor = new GestorReservas();
        // 1.Creamos clientes y habitaciones
        Cliente c1 = new Cliente("Sara", "23340823K");
        Cliente c2 = new Cliente("Marcos", "47582643G");
        Cliente c3 = new Cliente("Juan", "78234672J");

        Habitacion h1 = new Habitacion(23, "individual");
        Habitacion h2 = new Habitacion(9, "suite");
        Habitacion h3 = new Habitacion(1, "doble");

        Reserva r1 = new Reserva(c3, h2, LocalDate.parse("2025-06-01"));
        Reserva r2 = new Reserva(c1, h3, LocalDate.parse("2025-10-23"));
        gestor.añadirReserva(r1);
        gestor.añadirReserva(r2);

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try {

                System.out.println("Introduce una opcion:");
                System.out.println("1. Añadir reserva.");
                System.out.println("2. Mostrar reservas.");
                System.out.println("3. Salir del programa.");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        // 2.Creamos el gestor de reservas
                        System.out.println("Bienvenido al Hotel Condestable.");
                        System.out.println("Introduzca los datos de su reserva:");

                        System.out.println("Cliente:");
                        System.out.println("Nombre:");
                        String nombre = sc.nextLine();
                        System.out.print("DNI: ");
                        String dni = sc.nextLine();
                        Cliente c4 = new Cliente(nombre, dni);

                        System.out.println("Habitacion:");
                        System.out.println("Numero:");
                        int numeroHabitacion = Integer.parseInt(sc.nextLine());
                        System.out.print("Tipo (Individual/Doble/Suite):");
                        String tipoHabitacion = sc.nextLine();
                        Habitacion h4 = new Habitacion(numeroHabitacion, tipoHabitacion);

                        System.out.print("Fecha (año-mes-dia):");
                        String fecha = sc.nextLine();
                        LocalDate f4 = LocalDate.parse(fecha);

                        Reserva r3 = new Reserva(c4, h4, f4);
                        gestor.añadirReserva(r3);
                        break;
                    case 2:
                        gestor.mostrarReservas();
                        break;
                    case 3:
                        System.out.println("Cerrando el programa...");
                    default:
                        System.out.println("Opcion no valida.");
                }

            } catch (ConflictoReservaException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (DateTimeParseException e) {
                System.out.println("Error: Fecha incorrecta.");
            } catch (Exception e) {
                System.out.println("Error desconocido.");
            }
        } while (opcion != 3);
    }
}
