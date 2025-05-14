package com.mycompany.ejercicio4repaso;

public class Grupo {
    
    //Atributos
    private String nombregrupo;
    private Contacto[] listaDeContactos;
    
    //Constructor
    public Grupo(String ng, Contacto[] lc){
        this.nombregrupo = ng;
        this.listaDeContactos = lc;
    }
    
    //Setters
    public void setNombregrupo(String n){
        this.nombregrupo = n;
    }
    
    public void setListaDeContactos(Contacto[] lc){
        this.listaDeContactos = lc;
    }
    
    //Getters
    public String getNombregrupo(){
        return this.nombregrupo;
    }
           
    public Contacto[] getListaDeContacto(){
        return this.listaDeContactos;
    }
    
    //Métodos
    public void agregarContacto(Contacto c){
        for (int i = 0; i < listaDeContactos.length; i++) {
            this.listaDeContactos[i] = c;         
        }
    }
    
    public void eliminarContacto(String n){       
        for (int i = 0; i < listaDeContactos.length; i++) {
            if (n == listaDeContactos[i].getNombre()) {
                System.out.println("Elimina contacto");
            }
        }
    }
    
    public String buscarContacto(String nombre){
        for (int i = 0; i < listaDeContactos.length; i++) {
            if (nombre == listaDeContactos[i].getNombre()) {
                String nombre1 = nombre;
            }
            
        }
        return nombre;
    }
    
    public void mostrarContactos(){
        for (int i = 0; i < listaDeContactos.length; i++) {
            System.out.println(listaDeContactos[i]);
            
        }
    }
}
