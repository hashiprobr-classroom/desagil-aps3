package br.edu.insper.desagil.aps3.banco;

import java.util.List;

public class Cliente {
    private String cpf;
    private String nome;
    private List<Cartao> cartoes;

    public Cliente(String cpf, String nome, List<Cartao> cartoes) {
        this.cpf = cpf;
        this.nome = nome;
        this.cartoes = cartoes;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }
}
