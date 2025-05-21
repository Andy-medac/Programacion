/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciopablo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class EjercicioPablo {

    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        DatabaseManager db = new DatabaseManager();

        List<Nota> notas = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();

        String opcion = "";
        String nombre = "";
        String apellido = "";
        Long id_alumno = 0L;
        Double nota_alumno = 0.0d;

        do {

            try {

                System.out.println("[1] Insertar alumno.");
                System.out.println("[2] Listar los alumnos.");
                System.out.println("[3] Insertar nota a alumno.");
                System.out.println("[4] Mostrar notas del alumno.");
                System.out.println("[5] Calcular la media de un alumno.");
                System.out.println("[0] Salir.");
                System.out.print("Elección: ");
                opcion = sc.nextLine();

                switch (opcion) {

                    case "1": {
                        System.out.print("Dime el nombre del alumno: ");
                        nombre = sc.nextLine();
                        System.out.print("Dime el apellido del alumno: ");
                        apellido = sc.nextLine();
                        System.out.print("Dime la nota: ");
                        double nota = sc.nextDouble();

                        db.addAlumno(nombre, apellido, nota);

                        break;
                    }

                    case "2": {
                        alumnos.clear();
                        Alumno a;

                        db.listarAlumnos(alumnos);

                        System.out.println("=======Listado de alumnos=========");
                        System.out.println(alumnos);
                        System.out.println("==================================");

                        break;
                    }

                    case "3": {
                        System.out.println("=======Listado de alumnos=========");
                        System.out.println(alumnos);
                        System.out.println("==================================");

                        System.out.print("Dime el id del alumno al que quieras poner la nota: ");
                        id_alumno = sc.nextLong();
                        System.out.print("Dime la nota del alumno: ");
                        nota_alumno = sc.nextDouble();
                        sc.nextLine();
                        System.out.print("Dime la asignatura: ");
                        String asignatura = sc.nextLine();

                        db.addNota(id_alumno, nota_alumno, asignatura);

                        break;
                    }

                    case "4": {
                        System.out.println("=======Listado de alumnos=========");
                        System.out.println(alumnos);
                        System.out.println("==================================");

                        System.out.print("Dime el id del alumno que quieras saber la nota: ");
                        id_alumno = sc.nextLong();

                        notas.clear();
                        Nota n;

                        db.listarNotas(notas, id_alumno);

                        System.out.println("=======Listado de notas=========");
                        System.out.println(notas);
                        System.out.println("==================================");
                        break;
                    }

                    case "5": {
                        System.out.println("=======Listado de alumnos=========");
                        System.out.println(alumnos);
                        System.out.println("==================================");

                        System.out.print("Dime el id del alumno que quieras saber la nota: ");
                        id_alumno = sc.nextLong();

                        notas.clear();
                        Nota n;
                        Double media = 0.0d;

                        System.out.println("La media del alumno es " + db.media(id_alumno, media));
                    }

                }

                sc.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("No vale esa nota");
            }

        } while (!(opcion.equals("0")));

    }
}
