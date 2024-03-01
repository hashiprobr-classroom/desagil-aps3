package br.edu.insper.desagil.aps3.banco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String identificacao() {
        return apelido + " (corrente)";
    }
}
