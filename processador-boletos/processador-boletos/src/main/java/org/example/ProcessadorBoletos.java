package org.example;

import java.util.ArrayList;

public class ProcessadorBoletos {

    public static void processar(ArrayList<Boleto> boletos, Fatura fatura) {
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValorPago(), boleto.getData(), TipoPagamento.BOLETO);
            fatura.adicionarPagamento(pagamento);
        }
    }
}