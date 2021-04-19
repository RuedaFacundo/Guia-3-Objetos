package com.company.Ej3;
import java.text.DecimalFormat;

public class Cuadrado extends Figura {

    private double lado = 1.0;

    public Cuadrado (){}

    public Cuadrado (String coloreada, double lado){
        super (coloreada);
        this.lado = lado;
    }

    @Override
    public double calcularArea (){
        return Math.pow(this.lado, 2);
    }

    @Override
    public double calcularPerimetro (){
        return 4 * this.lado;
    }

    DecimalFormat df = new DecimalFormat("###.##");

    @Override
    public String toString (){
        return "Cuadrado = " +
                "Lado: " + this.lado +
                ", Area: " + df.format(calcularArea()) +
                ", Perimetro: " + df.format(calcularPerimetro());
    }
}
