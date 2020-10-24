package com.isabella.taller.uco;

import java.util.ArrayList;

public class Nota {
    private double notaParcial;
    private double notaFinal;
    private ArrayList<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(Asignatura materia) {
        this.materia = materia;
        this.notasSeguimiento = new ArrayList<>();
    }

    private double calcularSeguimiento(){
        return this.notasSeguimiento.stream().mapToDouble(nota -> nota.doubleValue()).sum() / this.notasSeguimiento.size();
    }


}
