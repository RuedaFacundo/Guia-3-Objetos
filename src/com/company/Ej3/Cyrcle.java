package com.company.Ej3;
import java.text.DecimalFormat;

public class Cyrcle extends Figura{

    private double radio = 1.0;
    public static final double PI = 3.141592653589793;

    public Cyrcle (){}

    public Cyrcle (String coloreada, double radio){
        super(coloreada);
        this.radio = radio;
    }

    @Override
    public double calcularArea (){
        return Math.pow(this.radio, 2) * PI;
    }

    @Override
    public double calcularPerimetro (){
        return 2 * PI * this.radio;
    }

    DecimalFormat df = new DecimalFormat("###.##");

    @Override
    public String toString (){
        return "Circulo = " +
                "Radio: " + this.radio +
                ", Area: " + df.format(calcularArea())  +
                ", Perimetro: " + df.format(calcularPerimetro());
    }
}
