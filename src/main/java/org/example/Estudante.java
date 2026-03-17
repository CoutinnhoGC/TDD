package org.example;

import java.util.Arrays;

public class Estudante {

    public double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) return 0;
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean isAprovado(double[] notas) {
        return calcularMedia(notas) >= 7.0;
    }
}