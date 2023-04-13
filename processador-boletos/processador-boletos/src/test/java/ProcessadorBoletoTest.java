import org.example.Boleto;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

class ProcessadorBoletoTest extends Main {

    @Test
    public void verificaSeBoletosIniciaVazio() {
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        Assertions.assertEquals(0,  boletos.size());
    }

    @Test
    public void deveMarcarFaturaComoPagaQuandoFaturaZerada() {
        LocalDate data = LocalDate.of(2023, 4, 12);
        Double valorTotal = 0.0;
        String nomeCliente = "José Itallo";
        Fatura fatura = new Fatura(data, valorTotal, nomeCliente);
        
        Assertions.assertTrue(fatura.isPaga());
    }
}