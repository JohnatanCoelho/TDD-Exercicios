import org.junit.jupiter.api.Test;

import com.edu.fatec.exc003.CalculadoraSalario;
import com.edu.fatec.exc003.Cargo;
import com.edu.fatec.exc003.Funcionario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSalarioTest {
    private final CalculadoraSalario calculadora = new CalculadoraSalario();

    @Test
    void testDesenvolvedorComSalarioMaiorOuIgualA3mil() {
        Funcionario dev = new Funcionario("João", "joao@email.com", 4000.0, Cargo.DESENVOLVEDOR);
        assertEquals(3200.0, calculadora.calcularSalarioLiquido(dev), 0.0001);
    }

    @Test
    void testDesenvolvedorComSalarioMenorQue3mil() {
        Funcionario dev = new Funcionario("Maria", "maria@email.com", 2500.0, Cargo.DESENVOLVEDOR);
        assertEquals(2250.0, calculadora.calcularSalarioLiquido(dev), 0.0001);
    }

    @Test
    void testDbaComSalarioMaiorOuIgualA2mil() {
        Funcionario dba = new Funcionario("Pedro", "pedro@email.com", 3000.0, Cargo.DBA);
        assertEquals(2250.0, calculadora.calcularSalarioLiquido(dba), 0.0001);
    }

    @Test
    void testDbaComSalarioMenorQue2mil() {
        Funcionario dba = new Funcionario("Ana", "ana@email.com", 1500.0, Cargo.DBA);
        assertEquals(1275.0, calculadora.calcularSalarioLiquido(dba), 0.0001);
    }

    @Test
    void testTestadorComSalarioMaiorOuIgualA2mil() {
        Funcionario testador = new Funcionario("Carlos", "carlos@email.com", 2000.0, Cargo.TESTADOR);
        assertEquals(1500.0, calculadora.calcularSalarioLiquido(testador), 0.0001);
    }

    @Test
    void testTestadorComSalarioMenorQue2mil() {
        Funcionario testador = new Funcionario("Julia", "julia@email.com", 1800.0, Cargo.TESTADOR);
        assertEquals(1530.0, calculadora.calcularSalarioLiquido(testador), 0.0001);
    }

    @Test
    void testGerenteComSalarioMaiorOuIgualA5mil() {
        Funcionario gerente = new Funcionario("Marcos", "marcos@email.com", 6000.0, Cargo.GERENTE);
        assertEquals(4200.0, calculadora.calcularSalarioLiquido(gerente), 0.0001);
    }

    @Test
    void testGerenteComSalarioMenorQue5mil() {
        Funcionario gerente = new Funcionario("Lucia", "lucia@email.com", 4000.0, Cargo.GERENTE);
        assertEquals(3200.0, calculadora.calcularSalarioLiquido(gerente), 0.0001);
    }
}
