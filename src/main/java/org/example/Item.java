package org.example;

import java.util.function.ToDoubleFunction;

public class Item {
    public static ToDoubleFunction<? super Item> getPreco;
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}