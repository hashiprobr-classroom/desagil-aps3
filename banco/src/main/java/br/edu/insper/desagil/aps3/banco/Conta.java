package br.edu.insper.desagil.aps3.banco;

public abstract class Conta {
    private Cliente cliente;
    protected String apelido;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract String identificacao();
}
