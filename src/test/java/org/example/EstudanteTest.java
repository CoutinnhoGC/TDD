package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudanteTest {

    @Test
    public void deveAprovarAlunoComMediaSete() {
        Estudante aluno = new Estudante();
        double[] notas = {7.0, 7.0, 7.0};
        assertTrue(aluno.isAprovado(notas));
    }

    @Test
    public void deveReprovarAlunoComMediaAbaixoDeSete() {
        Estudante aluno = new Estudante();
        double[] notas = {6.9, 5.0, 8.0};
        assertFalse(aluno.isAprovado(notas));
    }

    @Test
    void deveCalcularMediaDasNotas() {
        Estudante aluno = new Estudante();
        double[] notas = {8.0, 6.0};
        assertEquals(7.0, aluno.calcularMedia(notas));
    }

    @Test
    void deveCalcularDescontoDeDezPorCento() {
        VendaService vendaService = new VendaService();
        assertEquals(90.0, vendaService.calcularPreco(100.0, false));
    }

    @Test
    void deveCalcularDescontoParaVIP() {
        VendaService vendaService = new VendaService();
        assertEquals(80.0, vendaService.calcularPreco(100.0, true));
    }
}