package com.company.Ej2;

public class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona (){
    }

    public Persona (int dni, String nombre, String apellido, String email, String direccion){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString (){
        return "; Persona: " +
                " , DNI: " + this.dni +
                " , Nombre: " + this.nombre +
                " , Apellido: " + this.apellido +
                " , Email: " + this.email +
                " , Direccion: " + this.direccion;
    }

}
