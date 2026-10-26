
import org.junit.jupiter.api.Test;

import com.edu.fatec.exc001.Calculadora;
import com.edu.fatec.exc001.CalculadoraImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTests {

    private final Calculadora calculadora = new CalculadoraImpl(); // Instanciação direta

    @Test
    void testEscalenoValido() {
        assertEquals("Escaleno", calculadora.calcular(3, 4, 5));
    }

    @Test
    void testIsoscelesValido() {
        assertEquals("Isósceles", calculadora.calcular(5, 5, 3));
    }

    @Test
    void testEquilateroValido() {
        assertEquals("Equilátero", calculadora.calcular(4, 4, 4));
    }

    @Test
    void testIsoscelesPermutacoes() {
        assertEquals("Isósceles", calculadora.calcular(2, 2, 3));
        assertEquals("Isósceles", calculadora.calcular(2, 3, 2));
        assertEquals("Isósceles", calculadora.calcular(3, 2, 2));
    }

    @Test
    void testValorZero() {
        assertEquals("Não é um triângulo formado", calculadora.calcular(0, 4, 5));
    }

    @Test
    void testValorNegativo() {
        assertEquals("Não é um triângulo formado", calculadora.calcular(-1, 4, 5));
    }

    @Test
    void testSomaIgualTerceiroLadoPermutacoes() {
        assertEquals("Não é um triângulo formado", calculadora.calcular(1, 2, 3));
        assertEquals("Não é um triângulo formado", calculadora.calcular(1, 3, 2));
        assertEquals("Não é um triângulo formado", calculadora.calcular(3, 1, 2));
    }

    @Test
    void testSomaMenorTerceiroLadoPermutacoes() {
        assertEquals("Não é um triângulo formado", calculadora.calcular(1, 1, 3));
        assertEquals("Não é um triângulo formado", calculadora.calcular(1, 3, 1));
        assertEquals("Não é um triângulo formado", calculadora.calcular(3, 1, 1));
    }

    @Test
    void testTresZeros() {
        assertEquals("Não é um triângulo formado", calculadora.calcular(0, 0, 0));
    }
}
