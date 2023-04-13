import org.example.Boleto;
import org.example.Fatura;
import org.example.Main;
import org.example.ProcessadorBoletos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

class ProcessadorBoletoTest {

    @Test
    public void verificaSeBoletosIniciaVazio() {
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        Assertions.assertEquals(0,  boletos.size());
    }

    @Test
    public void deveMarcarFaturaComoPagaQuandoFaturaZerada() {
        LocalDate data = LocalDate.of(2023, 4, 12);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, BigDecimal.ZERO, nomeCliente);

        Assertions.assertTrue(fatura.isPaga());
    }

    @Test
    public void naoDeveMarcarFaturaComoPaga() {
        LocalDate data = LocalDate.of(2023, 4, 12);
        BigDecimal valorTotal = BigDecimal.valueOf(1500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));
        boletos.add(new Boleto("002", data, BigDecimal.valueOf(400.00)));

        ProcessadorBoletos.processar(boletos, fatura);

        Assertions.assertFalse(fatura.isPaga());
    }

    @Test
    public void PagaQuandoPagamentosIgualValorTotal() {

        LocalDate data = LocalDate.of(2023, 4, 12);
        BigDecimal valorTotal = BigDecimal.valueOf(1500.00);
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        ArrayList<Boleto> boletos = new ArrayList<>();
        boletos.add(new Boleto("001", data, BigDecimal.valueOf(500.00)));
        boletos.add(new Boleto("002", data, BigDecimal.valueOf(400.00)));
        boletos.add(new Boleto("003", data, BigDecimal.valueOf(600.00)));
        ProcessadorBoletos.processar(boletos,fatura);
        Assertions.assertEquals(true,fatura.isPaga());
    }
}