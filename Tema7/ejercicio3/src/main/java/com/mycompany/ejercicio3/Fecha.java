package com.mycompany.ejercicio3;

public class Fecha {

    //Atributos
    private int dia;
    private int mes;
    private int ano;

    //Constructor
    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    //Getters
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    //Setters
    public void setDia(int d) {
        this.dia = d;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public void setAno(int a) {
        this.ano = a;
    }

    //Métodos estándar para imprimir: toString
    public void imprimirDia() {
        System.out.println("El día es: " + this.dia);
    }

    public void imprimirMes() {
        System.out.println("El mes es: " + this.mes);
    }

    public void imprimirAno() {
        System.out.println("El año es: " + this.ano);
    }

    public String toString() {
        return "Fecha{" + this.dia + "/" + this.mes + "/" + this.ano + "}";
    }

    public void imprimirEstacion() {
        if ((mes == 12 && dia >= 21) || mes == 1 || mes == 2 || mes == 3 || (mes == 3 && dia < 21)) {
            System.out.println("La estación es invierno");
        } else if ((mes == 3 && dia >= 21) || mes == 4 || mes == 5 || (mes == 6 && dia < 21)) {
            System.out.println("La estación es primavera");
        } else if ((mes == 6 && dia >= 21) || mes == 7 || mes == 8 || (mes == 9 && dia < 21)) {
            System.out.println("La estación es verano");
        } else {
            System.out.println("La estación es otoño");
        }
    }

    public void imprimirSiglo() {
        
        if (ano<0) {
            int siglo = (ano / 100) + 1;
            System.out.println("Es el siglo " + siglo);
        }
        else{
            System.out.println("No puedo imprimir este siglo");
        }
    }
}
