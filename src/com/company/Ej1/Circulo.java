package com.company.Ej1;

public class Circulo {

    private double radio = 1.0;
    private String color = "rojo";
    public static final double PI = 3.141592653589793;

    public Circulo(){
    }

    public Circulo (double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea (){
        double area = radio * radio * PI;
        return area;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public String toString (){
        return "Circulo: " +
                "Radio: " + this.radio +
                ", Color: " + this.color +
                ", Area Circulo: " + calcularArea();
    }

}
