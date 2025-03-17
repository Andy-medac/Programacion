package com.mycompany.ejercicio7;

/**
Una gestoría trabaja con varios tipos de empresas (autónomos, pymes y grandes empresas). Por supuesto, en la gestoría trabajan gestores.


Su software de gestión debe poder clasificar a las empresas:
- Todas tienen nombre y CIF.
- Las pymes también tienen sede y número de socios.
- Las grandes empresas también tienen sede y patrimonio (en euros).

Por otro lado, los gestores tienen nombre, número de teléfono y email.
La gestoría asigna 1 gestor a los autónomos, 2 gestores a las pymes y 5 gestores a las grandes empresas.
Crea 10 gestores en el main y asignarlos en función de las empresas que se creen.
(La asignación de gestores a las empresas debe hacerse en la clase Gestoría)
(En el main se crean los gestores y las empresas y se le pasan a la Gestoría para que asigne).
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Gestor g1 = new Gestor("Aitor", 649341277, "auhsd");
        Gestor g2 = new Gestor("Paula", 649448579, "drgasg");
        Gestor g3 = new Gestor("Sergio", 649345277, "gkhk");
        Gestor g4 = new Gestor("Mario", 609567272, "aasfdsd");
        Gestor g5 = new Gestor("Pedro", 649348888, "zdfgdv");
        Gestor g6 = new Gestor("Adrian", 649347897, "SDFASF");
        Gestor g7 = new Gestor("Maria", 692384701, "sdfsgr");
        Gestor g8 = new Gestor("Lola", 641038475, "fhfyjy");
        Gestor g9 = new Gestor("Pablo", 629384234, "sfargdf");
        Gestor g10 = new Gestor("Pol", 674229383, "jkykgh");

        GranEmpresa gE1 = new GranEmpresa("Monstruos SA", "23984792H", "Madrid", 29346928);
        Pyme p1 = new Pyme("Epic games", "123726349G", "Jaen", 89667);
        Autonomo a1 = new Autonomo("Peluqueria Manoli", "238749A");
        
        Gestoria.asignarGestorEmpresa(g1, p1);
        Gestoria.asignarGestorEmpresa(g2, p1);
        Gestoria.asignarGestorEmpresa(g3, a1);
        Gestoria.asignarGestorEmpresa(g4, gE1);
        Gestoria.asignarGestorEmpresa(g5, gE1);
        Gestoria.asignarGestorEmpresa(g6, gE1);
        Gestoria.asignarGestorEmpresa(g7, gE1);
        Gestoria.asignarGestorEmpresa(g8, gE1);

    }
}
