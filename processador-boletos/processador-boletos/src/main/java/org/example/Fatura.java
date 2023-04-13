package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Fatura {
    private LocalDate data;
    private BigDecimal valorTotal;
    private String nomeCliente;
    private boolean paga;

    public Fatura(LocalDate data, BigDecimal valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        if(BigDecimal.ZERO.compareTo(valorTotal) == 0) this.setPaga(true);
        else this.setPaga(false);
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
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

}
