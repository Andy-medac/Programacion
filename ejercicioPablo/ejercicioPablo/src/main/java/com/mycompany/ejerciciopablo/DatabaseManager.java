package com.mycompany.ejerciciopablo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DatabaseManager {

    PreparedStatement pt = null;
    ResultSet rs = null;
    private String url = "jdbc:mysql://localhost:3306/prueba_bloque3?serverTimezone=UTC";
    private String user = "root";
    private String pass = "Med@c";
    private Connection con;

    public DatabaseManager() {
        try {
            con = con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {

        }
    }

    public Alumno getAlumno(ResultSet rs) throws SQLException {
        Alumno a = new Alumno();
        a.setId(rs.getLong("id"));
        a.setNombre(rs.getString("nombre"));
        a.setApellido(rs.getString("apellido"));
        a.setNota(rs.getDouble("nota"));
        return a;

    }

    public Nota getNota(ResultSet rs) throws SQLException {
        Nota a = new Nota();
        a.setId(rs.getLong("id"));
        a.setIdAlumno(rs.getLong("id_alumno"));
        a.setAsignatura(rs.getString("asignatura"));
        a.setNota(rs.getDouble("nota"));
        return a;

    }

    public void addAlumno(String n, String a, double nota) {
        try {
            pt = con.prepareStatement("INSERT INTO alumno(nombre,apellido, nota) VALUES(?,?,?)");
            pt.setString(1, n);
            pt.setString(2, a);
            pt.setDouble(3, nota);
            pt.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public void listarAlumnos(List<Alumno> alumnos) {
        try {
            Alumno a;
            pt = con.prepareStatement("SELECT * FROM alumno");
            rs = pt.executeQuery();

            while (rs.next()) {
                a = getAlumno(rs);
                alumnos.add(a);
            }
        } catch (SQLException e) {

        }
    }

    public void addNota(Long id, double nota, String asig) {
        try {
            pt = con.prepareStatement("INSERT INTO nota(id_alumno, asignatura, nota) VALUES(?,?,?)");
            pt.setDouble(1, id);
            pt.setString(2, asig);
            pt.setDouble(3, nota);
            pt.executeUpdate();
        } catch (SQLException e) {

        }
    }

    public void listarNotas(List<Nota> notas, Long id) {
        try {
            Nota n;
            pt = con.prepareStatement("SELECT * FROM nota WHERE id_alumno = ?");
            pt.setLong(1, id);
            rs = pt.executeQuery();

            while (rs.next()) {
                n = getNota(rs);
                notas.add(n);
            }
        } catch (SQLException e) {

        }
    }

    public Double media(Long id, double mediaD) {
        try {
            pt = con.prepareStatement("SELECT AVG(nota) AS media FROM nota WHERE id_alumno = ?");
            pt.setLong(1, id);
            rs = pt.executeQuery();

            while (rs.next()) {
                mediaD = rs.getDouble("media");
            }
        } catch (SQLException e) {

        }
        return mediaD;
    }

}
