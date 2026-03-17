package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Double> itens = new ArrayList<>();

    public void adicionar(String nome, double preco) {
        itens.add(preco);
    }

    public void remover(double preco) {
        itens.remove(preco);
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public double getTotal() {
        double soma = 0;
        for (double preco : itens) {
            soma += preco;
        }
        return soma;
    }

}