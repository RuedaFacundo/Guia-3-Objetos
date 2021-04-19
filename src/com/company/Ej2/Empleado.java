package com.company.Ej2;

public class Empleado extends Persona{

    private double salario;
    private String turno;

    public Empleado (){
    }

    public Empleado (int dni, String nombre, String apellido, String email, String direccion, double salario, String turno){
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double salarioAnual (double salario){
        return salario * 12;
    }

    @Override
    public String toString (){
        return "Empleado: " +
                " , Salario Mensual: " + this.salario +
                " , Salario Anual: " + salarioAnual(this.salario) +
                " , Turno: " + this.turno +
                super.toString();
    }

}
