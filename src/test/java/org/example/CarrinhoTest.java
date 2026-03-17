package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CarrinhoTest {
    @Test
    public void deveCalcularTotalDoCarrinho() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(new Item("Teclado", 100.0));
        carrinho.adicionar(new Item("Mouse", 50.0));

        assertEquals(150.0, carrinho.getTotal(), 0.001);
    }

    @Test
    void deveAdicionarItem() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar("Mouse", 50.0);
        assertEquals(1, carrinho.getQuantidadeItens());
    }

    @Test
    void deveRemoverItem() {
        Carrinho carrinho = new Carrinho();
        carrinho.adicionar("Mouse", 50.0);
        carrinho.remover("Mouse");
        assertEquals(0, carrinho.getQuantidadeItens());
    }
}