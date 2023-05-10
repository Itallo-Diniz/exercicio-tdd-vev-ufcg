package functionalTest;

import org.example.CalculadoraDeSalario;
import org.example.Cargo;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSalariosFunctionalTests {
    @Test
    public void Teste1() {
        // Teste AVL - Abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1000.0, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 900.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste2() {
        // Teste AVL - Imediatamente abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2999.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 2699.10;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste3() {
        // Teste AVL - Igual ao limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 3000.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 2400.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste4() {
        // Teste AVL - Imediatamente acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 3001.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 2400.80;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste5() {
        // Teste AVL - Acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 3500.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 2800.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste6() {
        // Teste AVL - Abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1000.00, Cargo.DBA);
        double salarioEsperado = 850.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste7() {
        // Teste AVL - Imediatamente abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1999.00, Cargo.DBA);
        double salarioEsperado = 1699.15;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste8() {
        // Teste AVL - Igual ao limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2000.00, Cargo.DBA);
        double salarioEsperado = 1500.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste9() {
        // Teste AVL - Imediatamente acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2001.00, Cargo.DBA);
        double salarioEsperado = 1500.75;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste10() {
        // Teste AVL - Acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2500.00, Cargo.DBA);
        double salarioEsperado = 1875.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste11() {
        // Teste AVL - Abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1000.00, Cargo.TESTADOR);
        double salarioEsperado = 850.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste12() {
        // Teste AVL - Imediatamente abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1999.00, Cargo.TESTADOR);
        double salarioEsperado = 1699.15;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste13() {
        // Teste AVL - Igual ao limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2000.00, Cargo.TESTADOR);
        double salarioEsperado = 1500.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste14() {
        // Teste AVL - Imediatamente acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2001.00, Cargo.TESTADOR);
        double salarioEsperado = 1500.75;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste15() {
        // Teste AVL - Acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 2500.00, Cargo.TESTADOR);
        double salarioEsperado = 1875.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste16() {
        // Teste AVL - Abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 4000.00, Cargo.GERENTE);
        double salarioEsperado = 3200.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste17() {
        // Teste AVL - Imediatamente abaixo do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 4999.00, Cargo.GERENTE);
        double salarioEsperado = 3999.20;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste18() {
        // Teste AVL - Igual ao limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 5000.00, Cargo.GERENTE);
        double salarioEsperado = 3500.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste19() {
        // Teste AVL - Imediatamente acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 5001.00, Cargo.GERENTE);
        double salarioEsperado = 3500.70;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste20() {
        // Teste AVL - Acima do limite
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 6000.00, Cargo.GERENTE);
        double salarioEsperado = 4200.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste21() {
        // Partição de equivalencia - DESENVOLVEDOR que recebem abaixo de 3 mil
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1500.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 1350.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste22() {
        // Partição de equivalencia - DESENVOLVEDOR que recebem acima de 3 mil
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 4000.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = 3200.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste23() {
        // Partição de equivalencia - DBA que recebe abaixo de 2 mil
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1500.00, Cargo.DBA);
        double salarioEsperado = 1275.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste24() {
        // Partição de equivalencia - DBA que recebe acima de 2 mil
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 3000.00, Cargo.DBA);
        double salarioEsperado = 2250.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste25() {
        // Partição de equivalencia - TESTADOR que recebe abaixo de 2.000,00
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1500.00, Cargo.TESTADOR);
        double salarioEsperado = 1275.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste26() {
        // Partição de equivalencia - TESTADOR que recebe acima de 2.000,00
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 5000.00, Cargo.TESTADOR);
        double salarioEsperado = 3750.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste27() {
        // Partição de equivalencia - GERENTE que recebe abaixo de 5.000,00
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 1000.00, Cargo.GERENTE);
        double salarioEsperado = 800.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }
    @Test
    public void Teste28() {
        // Partição de equivalencia - GERENTE que recebe abaixo de 5.000,00
        Funcionario desenvolvedor = new Funcionario("João", "joao@empresa.com", 8000.00, Cargo.GERENTE);
        double salarioEsperado = 5600.00;
        double salarioCalculado = CalculadoraDeSalario.calculaSalario(desenvolvedor);
        assertEquals(salarioEsperado, salarioCalculado);
    }

}
