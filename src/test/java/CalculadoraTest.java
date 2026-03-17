import static org.junit.jupiter.api.Assertions.*;

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarDoisNumerosPositivos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void deveLancarExcecaoAoDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    @Test
    void deveSomarComNumeroNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.somar(5, -2));
    }

    @Test
    void deveSubtrairSimples() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.subtrair(7, 3));
    }

    @Test
    void deveMultiplicarSimples() {
        Calculadora calc = new Calculadora();
        assertEquals(12, calc.multiplicar(4, 3));
    }

    @Test
    void deveDividirSimples() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    void deveLancarExcecaoNaDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

}
