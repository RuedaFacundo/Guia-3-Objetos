package com.company.Ej3;
import java.text.DecimalFormat;

public class Rectangulo extends Figura {

    private double base = 1.0;
    private double altura = 1.0;

    public Rectangulo(){
    }

    public Rectangulo (String coloreada, double base, double altura){
        super(coloreada);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea (){
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro (){
        return (this.base * 2) + (this.altura * 2);
    }

    DecimalFormat df = new DecimalFormat("###.##");

    @Override
    public String toString (){
        return "Rectangulo = " +
                "Base: " + this.base +
                ", Altura: " + this.altura +
                ", Area: " + df.format(calcularArea()) +
                ", Perimetro: " + df.format(calcularPerimetro());
    }
}
