package br.edu.insper.desagil.aps3.banco;

import java.util.HashMap;
import java.util.Map;

public class Agencia {
    private String codigo;
    private String endereco;
    private Map<Integer, Conta> contas;

    public Agencia(String codigo, String endereco) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.contas = new HashMap<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEndereco() {
        return endereco;
    }

    public Map<Integer, Conta> getContas() {
        return contas;
    }

    public void abreConta(int codigo, Conta conta) {
        contas.put(codigo, conta);
    }
}
