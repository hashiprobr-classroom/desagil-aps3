package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {
    private List<Musica> musicas;

    public Usuario(int id, String nome) {
        super(id, nome);
        this.musicas = new ArrayList<>();
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public boolean jaAdicionou(Musica novaMusica) {
        int id = novaMusica.getArtista().getId();
        String titulo = novaMusica.getTitulo();
        for (Musica musica : musicas) {
            if (musica.getArtista().getId() == id && musica.getTitulo().equals(titulo)) {
                return true;
            }
        }
        return false;
    }

    public void adiciona(Musica novaMusica) {
        if (!jaAdicionou(novaMusica)) {
            musicas.add(novaMusica);
        }
    }
}
