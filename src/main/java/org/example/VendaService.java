package org.example;

public class VendaService {
    public double calcularPreco(double valor, boolean isVip) {
        if (isVip) {
            return valor * 0.80;
        }
        return valor * 0.90;
    }
}
