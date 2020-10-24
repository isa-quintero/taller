package com.calculadora.app;

import com.calculadora.domain.Calculadora;

public class AppCalculadora {
    public static void main(String[] args) {
        Calculadora casio = new Calculadora( "casio");
        Calculadora casio1 = new Calculadora( "casio1");
        Calculadora casio2 = new Calculadora( "casio2");
        Calculadora casio3 = new Calculadora( "casio3");

        Calculadora casio4 = new Calculadora( "casio4");
        Calculadora casio5 = new Calculadora( "casio5");
        System.out.println(casio5.getSerial());

        System.out.println(" El numero de instancias es: " + Calculadora.getNroInstancias());
    }
}
