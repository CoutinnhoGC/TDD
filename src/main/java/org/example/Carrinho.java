package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    public void adicionar(String nome, double preco) {
        itens.add(new Item(nome, preco));
    }

    public void remover(String nome) {
        itens.removeIf(item -> item.getNome().equals(nome));
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public double getTotal() {
        double soma = 0;
        if (itens == null) return 0;

        for (Item item : itens) {
            if (item != null) {
                soma += item.getPreco();
            }
        }
        return soma;
    }
}