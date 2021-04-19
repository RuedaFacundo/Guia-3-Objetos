package com.company.Ej1;

public class Cilindro extends Circulo {

    private double altura = 1.0;

    public Cilindro(){
    }

    public Cilindro (double radio, String color, double altura){
        super(radio, color);
        this.altura = altura;
    }

    public double calcularVolumen (){
        double volumen = super.calcularArea() * altura;
        return volumen;
    }

    @Override
    public String toString (){
        return "Cilindro: " +
                "Subclase de  " + super.toString() +
                ", Altura: " + this.altura +
                ", Area cilindro: " + calcularArea() +
                ", Volumen: " + calcularVolumen();
    }

    @Override
    public double calcularArea(){
        double area = 2 * PI * super.getRadio() * altura + (2* super.calcularArea());
        return area;
    }

}
