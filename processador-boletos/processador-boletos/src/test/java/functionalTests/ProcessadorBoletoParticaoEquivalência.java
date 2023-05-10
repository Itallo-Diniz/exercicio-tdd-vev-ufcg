package functionalTests;

import org.example.Boleto;
import org.example.Fatura;
import org.example.ProcessadorBoletos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProcessadorBoletoParticaoEquivalência {


    /**
     * Teste para Partições de equivalência.
     */

    /**
     *  Classe fatura paga
     */

    @Test
    public void testaParticaoFaturaPaga() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(1500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(1500.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertTrue(fatura.isPaga());
    }


    /**
     *  Classe fatura não paga
     */

    @Test
    public void testaParticaoFaturaNaoPaga() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(1500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(1000.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertFalse(fatura.isPaga());
    }
}
