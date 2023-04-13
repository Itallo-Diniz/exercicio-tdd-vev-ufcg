package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Fatura {
    private LocalDate data;
    private BigDecimal valorTotal;
    private String nomeCliente;
    private ArrayList<Pagamento> pagamentos;


    public Fatura(LocalDate data, BigDecimal valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.pagamentos = new ArrayList<>();
    }

    public LocalDate getData() {
        return data;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public boolean isPaga() {
        if(BigDecimal.ZERO.compareTo(this.valorTotal) == 0) return true;
        BigDecimal valorPago = BigDecimal.ZERO;
        for (Pagamento pagamento: this.pagamentos) {
            valorPago = valorPago.add(pagamento.getValor());
        }
        if (valorPago.compareTo(this.valorTotal) >= 0) {
            return true;
        }
        return false;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}
