package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CupidoMusicalTest {
    private CupidoMusical c;
    private Usuario a;
    private Usuario b;

    @BeforeEach
    void setUp() {
        c = new CupidoMusical();
        a = criaUsuario(123);
        b = criaUsuario(456);
    }

    @Test
    void semLikesComMusicas() {
        criaMusicaEmComum();
        assertFalse(c.deuMatch(a, b));
    }

    @Test
    void comLikesSemMusicas() {
        c.daLike(123, 456);
        c.daLike(456, 123);
        assertFalse(c.deuMatch(a, b));
    }

    @Test
    void comLikesComMusicas() {
        criaMusicaEmComum();
        c.daLike(123, 456);
        c.daLike(456, 123);
        assertTrue(c.deuMatch(a, b));
    }

    private Usuario criaUsuario(int id) {
        Usuario usuario = mock(Usuario.class);
        when(usuario.getId()).thenReturn(id);
        return usuario;
    }

    private void criaMusicaEmComum() {
        Musica musica = mock(Musica.class);

        List<Musica> musicas = new ArrayList<>();
        musicas.add(musica);

        when(a.getMusicas()).thenReturn(musicas);
        when(b.jaAdicionou(musica)).thenReturn(true);
    }
}
