package functionalTests;

import org.example.Boleto;
import org.example.Fatura;
import org.example.ProcessadorBoletos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

class ProcessadorBoletoTestAVL {


    /**
     * Testes AVL.
     */

    /**
     *  Fixando o valor da fatura primeiro.
     */

    /**
     *  Valor pago por boletos abaixo da fatura.
     */
    @Test
    public void boletoAbaixoFatura() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(400.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertFalse(fatura.isPaga());
    }

    /**
     *  Valor pago por boletos logo abaixo da fatura.
     */
    @Test
    public void boletoBemAbaixoFatura() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(499.99)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertFalse(fatura.isPaga());
    }

    /**
     *  Valor pago por boletos igual ao da fatura.
     */
    @Test
    public void boletoIgualFatura() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertTrue(fatura.isPaga());
    }

    /**
     * Valor pago do boleto logo acima do valor da fatura.
     */
    @Test
    public void boletoLogoAcimaFatura() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.01)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertTrue(fatura.isPaga());
    }

    /**
     * Valor pago do boleto logo acima do valor da fatura.
     */
    @Test
    public void boletoAcimaFatura() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(600.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertTrue(fatura.isPaga());
    }

    /**
     * Agora fixando o valor do pagamento e variando o valor da fatura.
     */

    /**
     *  Valor da fatura abaixo do valor pago.
     */
    @Test
    public void faturaAbaixoDoPagamento() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(400.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertTrue(fatura.isPaga());
    }

    /**
     *  Valor da fatura logo abaixo do valor pago.
     */
    @Test
    public void faturaLogoAbaixoDoPagamento() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(499.99);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertTrue(fatura.isPaga());
    }

    /**
     *  Valor da fatura logo acima do valor pago.
     */
    @Test
    public void faturaLogoAcimaDoPagamento() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(500.01);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertFalse(fatura.isPaga());
    }

    /**
     *  Valor da fatura logo acima do valor pago.
     */
    @Test
    public void faturaAcimaDoPagamento() {
        LocalDate data = LocalDate.of(2023, 5, 10);
        BigDecimal valorTotal = BigDecimal.valueOf(600);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertFalse(fatura.isPaga());
    }
}