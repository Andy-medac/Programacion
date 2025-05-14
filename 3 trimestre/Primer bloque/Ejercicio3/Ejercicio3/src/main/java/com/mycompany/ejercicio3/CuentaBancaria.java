package com.mycompany.ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String t) {
        this.titular = t;
        this.saldo = 0.0d;
    }

    public void retirar1(double cantidad) {
        try {
            if (cantidad > this.saldo) {
                throw new SaldoInsuficienteException("Cantidad mayor al saldo.");
            } if (cantidad <= 0) {
               throw new IllegalArgumentException("Debe ser una cantidad positiva");
            } 
            this.saldo -= cantidad;
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        
        }catch (Exception e) {
            System.out.println("Error desconocido.");
        }
    }
    
    public void retirar2(double cantidad) throws SaldoInsuficienteException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad insuficiente. Debe de ser mayor que 0.");
        }
        if (cantidad > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
    }

    public void ingresar1(double cantidad) {
        try {
            if (cantidad <= 0) {
                throw new IllegalArgumentException("Cantidad a ingresar inválida. ");
            }
            this.saldo += cantidad;
        } catch (IllegalArgumentException e){
            System.out.println("Error: " +  e.getMessage());
        } catch (Exception e) {
            System.out.println("Error desconocido.");
        }
    }
    
    public void ingresar2(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("Cantidad a ingresar inválida. ");
        }
    }

    public String consultarSaldo() {
        return "El saldo es de " + this.saldo + " euros.";
    }
}
