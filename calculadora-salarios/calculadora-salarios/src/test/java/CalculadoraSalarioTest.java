import org.example.CalculadoraDeSalario;
import org.example.Cargo;
import org.example.Funcionario;
import org.example.Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraSalarioTest extends Main {

    @Test
    public void testCalculaSalarioDesenvolvedorSalarioMaiorIgualTresMil() {
        // Arrange
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 4000.0, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 3200.0; // 20% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioDesenvolvedorSalarioMenorQueTresMil() {
        // Arrange
        Funcionario desenvolvedor = new Funcionario("Pedro", "pedro@empresa.com", 2500.0, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 2250.0; // 10% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioDBASalarioMaiorIgualDoisMil() {
        // Arrange
        Funcionario dba = new Funcionario("Maria", "maria@empresa.com", 2500.0, Cargo.DBA);
        double salarioEsperado = 1875.0; // 25% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(dba);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioDBASalarioMenorQueDoisMil() {
        // Arrange
        Funcionario dba = new Funcionario("Ana", "ana@empresa.com", 1500.0, Cargo.DBA);
        double salarioEsperado = 1275.0; // 15% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(dba);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioTestadorSalarioMaiorIgualDoisMil() {
        // Arrange
        Funcionario testador = new Funcionario("José", "jose@empresa.com", 3000.0, Cargo.TESTADOR);
        double salarioEsperado = 2250.0; // 25% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(testador);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioTestadorSalarioMenorQueDoisMil() {
        // Arrange
        Funcionario testador = new Funcionario("Carlos", "carlos@empresa.com", 1500.0, Cargo.TESTADOR);
        double salarioEsperado = 1275.0; // 15% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(testador);

        //Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioGerenteSalarioMaiorIgualCincoMil() {
        // Arrange
        Funcionario gerente = new Funcionario("Antônio", "antonio@empresa.com", 6000.0, Cargo.GERENTE);
        double salarioEsperado = 4200.0; // 30% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(gerente);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }

    @Test
    public void testCalculaSalarioGerenteSalarioMenorQueCincoMil() {
        // Arrange
        Funcionario gerente = new Funcionario("Paulo", "paulo@empresa.com", 4000.0, Cargo.GERENTE);
        double salarioEsperado = 3200.0; // 20% de desconto

        // Act
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(gerente);

        // Assert
        assertEquals(salarioEsperado, salarioCalculado);
    }
}