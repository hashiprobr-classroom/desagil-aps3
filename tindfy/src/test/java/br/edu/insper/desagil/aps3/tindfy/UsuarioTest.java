package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UsuarioTest {
    private Usuario u;

    @BeforeEach
    void setUp() {
        u = new Usuario(12, "João da Silva");
        u.adiciona(criaMusica(34, "The Unforgiven"));
        u.adiciona(criaMusica(56, "Killing In The Name"));
        u.adiciona(criaMusica(78, "Hells Bells"));
    }

    @Test
    void naoAdiciona() {
        u.adiciona(criaMusica(56, "Killing In The Name"));
        assertEquals(3, u.getMusicas().size());
    }

    @Test
    void adiciona() {
        Musica musica = criaMusica(34, "The Unforgiven II");
        u.adiciona(musica);
        assertTrue(u.jaAdicionou(musica));
    }

    private Musica criaMusica(int idArtista, String titulo) {
        Artista artista = mock(Artista.class);
        when(artista.getId()).thenReturn(idArtista);

        Musica musica = mock(Musica.class);
        when(musica.getArtista()).thenReturn(artista);
        when(musica.getTitulo()).thenReturn(titulo);
        return musica;
    }
}
