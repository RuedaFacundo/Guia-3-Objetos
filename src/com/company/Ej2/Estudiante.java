package com.company.Ej2;

public class Estudiante extends Persona{

    private int año;
    private double cuota;
    private String carrera;

    public Estudiante (){
    }

    public Estudiante (int dni, String nombre, String apellido, String email, String direccion, int año, double cuota, String carrera){
        super(dni, nombre, apellido, email, direccion);
        this.año = año;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public double getCuota() {
        return cuota;
    }

    @Override
    public String toString (){
        return "Estudiante: " +
                " , Año ingreso: " + this.año +
                " , Cuota: " + this.cuota +
                " , Carrera: " + this.carrera +
                super.toString();
    }

}
