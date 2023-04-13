package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pagamento {
    private BigDecimal valor;
    private LocalDate data;
    private TipoPagamento tipo;

    public Pagamento(BigDecimal valor, LocalDate data, TipoPagamento tipo) {
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public TipoPagamento getTipo() {
        return tipo;
    }
}
