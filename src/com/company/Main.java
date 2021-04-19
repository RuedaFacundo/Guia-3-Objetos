package com.company;

import com.company.Ej1.Circulo;
import com.company.Ej1.Cilindro;
import com.company.Ej2.Persona;
import com.company.Ej2.Estudiante;
import com.company.Ej2.Empleado;
import com.company.Ej3.Cuadrado;
import com.company.Ej3.Figura;
import com.company.Ej3.Rectangulo;
import com.company.Ej3.Cyrcle;

public class Main {

    public static void main(String[] args) {

        /// EJERCICIO 1

        Cilindro cilindrito = new Cilindro();
        System.out.println(cilindrito);
        Cilindro cilindro2 = new Cilindro(50, "Verde", 40);
        System.out.println(cilindro2);

        /// EJERCICIO 2

        Estudiante Facundo = new Estudiante(36617481, "Facundo", "Rueda", "facundorueda@hotmail.com", "Gascon 1060", 2020, 3000.00, "TUP");
        Estudiante Rodrigo = new Estudiante(36623940, "Rodrigo", "Martinez", "rodrimz@hotmail.com", "Irala 760", 2021, 3300.00, "TUP");
        Estudiante Hugo = new Estudiante(32429301, "Hugo", "Moreno", "hugom@hotmail.com", "Vieytes 1240", 2021, 3300.00, "TUP");
        Estudiante Hernan = new Estudiante(36003399, "Hernan", "Pino", "hernanpino@hotmail.com", "Alberti 1360", 2020, 3000.00, "TUP");

        Empleado Franco = new Empleado(35788911, "Franco", "Maffioni", "francomaff@hotmail.com", "Don Bosco 2100", 45000, "Mañana");
        Empleado Gabriel = new Empleado(39001399, "Gabriel", "Maffioni", "gabrielmaff@hotmail.com", "Friuli 200", 30000, "Noche");
        Empleado Flor = new Empleado(36383900, "Flor", "Gonzalez", "florgonzalez@hotmail.com", "Rawson 2103", 42000, "Noche");
        Empleado Alvaro = new Empleado(34889330, "Alvaro", "Soto", "alvarosoto@hotmail.com", "La Rioja 546", 45000, "Mañana");

        Object [] objects = new Object [8];
        objects[0] = Facundo;
        objects[1] = Rodrigo;
        objects[2] = Hugo;
        objects[3] = Hernan;
        objects[4] = Franco;
        objects[5] = Gabriel;
        objects[6] = Flor;
        objects[7] = Alvaro;

        for (int i=0; i< objects.length; i++){
            System.out.println(objects[i]);
        }

        double total = 0;
        for (int i=0; i< objects.length; i++){
            if (objects[i] instanceof Estudiante){
                total += ((Estudiante) objects[i]).getCuota();
            }
        };
        System.out.println("La suma del total de la cuota mensual es: " + total);

        /// EJERCICIO 3

        Rectangulo rectanguloA = new Rectangulo("coloreado", 15, 30);
        Cyrcle circuloA = new Cyrcle("Sin colorear", 30);
        Cuadrado cuadradoA = new Cuadrado("coloreado", 20);
        System.out.println(rectanguloA);
        System.out.println(circuloA);
        System.out.println(cuadradoA);

    }
}

