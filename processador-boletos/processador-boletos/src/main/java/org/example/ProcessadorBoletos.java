package org.example;

import java.util.ArrayList;

public class ProcessadorBoletos {

    public static void processar(ArrayList<Boleto> boletos, Fatura fatura) {
        for (Boleto boleto : boletos) {
            fatura.setValorPago(fatura.getValorPago().add(boleto.getValorPago()));
        }
    }
}
