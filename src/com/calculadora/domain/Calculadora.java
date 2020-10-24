package com.calculadora.domain;

public class Calculadora {
    private static int nroInstancias =0;
    private String marca;
    private int serial;

    public Calculadora (String marca) {
        if (Calculadora.getNroInstancias()<5) {

            this.marca = marca;
            this.serial = nroInstancias + 1;

            Calculadora.nroInstancias++;
        } else {
            this.marca= null;
            System.out.println("no se pueden crear mas ");
        }
    }

    public static int getNroInstancias() {
        return nroInstancias;
    }

    public int getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }
}
