package br.edu.insper.desagil.aps3.banco;

import java.time.LocalDate;

public abstract class Cartao {
    private String numero;
    private LocalDate vencimento;
    private ContaCorrente conta;

    public Cartao(String numero, LocalDate vencimento, ContaCorrente conta) {
        this.numero = numero;
        this.vencimento = vencimento;
        this.conta = conta;
    }

    public String getNumero() {
        return numero;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public boolean estaVencido(LocalDate data) {
        return data.isAfter(vencimento);
    }
}
