package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Fatura {
    private LocalDate data;
    private BigDecimal valorTotal;
    private String nomeCliente;
    private boolean paga;
    private BigDecimal valorPago;

    public Fatura(LocalDate data, BigDecimal valorTotal, String nomeCliente) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        if(BigDecimal.ZERO.compareTo(valorTotal) == 0) this.setPaga(true);
        else this.setPaga(false);
        this.valorPago = BigDecimal.ZERO;
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

    private void setPaga(boolean paga) {
        this.paga = paga;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
        if (this.valorPago.compareTo(this.valorTotal) >= 0) {
            this.setPaga(true);
        }
    }
}
