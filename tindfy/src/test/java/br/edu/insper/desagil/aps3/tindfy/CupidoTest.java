package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CupidoTest {
    private Cupido c;
    private Usuario a;
    private Usuario b;

    @BeforeEach
    void setUp() {
        c = new Cupido();
        a = criaUsuario(123);
        b = criaUsuario(456);
    }

    @Test
    void ninguemDaLike() {
        assertFalse(c.deuMatch(a, b));
    }

    @Test
    void primeiroDaLike() {
        c.daLike(123, 456);
        assertFalse(c.deuMatch(a, b));
    }

    @Test
    void segundoDaLike() {
        c.daLike(123, 456);
        c.daLike(456, 123);
        assertTrue(c.deuMatch(a, b));
    }

    private Usuario criaUsuario(int id) {
        Usuario usuario = mock(Usuario.class);
        when(usuario.getId()).thenReturn(id);
        return usuario;
    }
}
