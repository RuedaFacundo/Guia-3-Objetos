package com.company.Ej3;

public abstract class Figura {

    private String coloreada;

    public Figura (){}

    public Figura (String coloreada){
        this.coloreada = coloreada;
    }

    public abstract double calcularArea ();
    public abstract double calcularPerimetro ();

}
