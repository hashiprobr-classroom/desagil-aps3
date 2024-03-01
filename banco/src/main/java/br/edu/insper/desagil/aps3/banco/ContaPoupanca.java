package br.edu.insper.desagil.aps3.banco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String identificacao() {
        return apelido + " (poupança)";
    }
}
