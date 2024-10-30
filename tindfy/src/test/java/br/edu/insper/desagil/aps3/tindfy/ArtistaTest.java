package br.edu.insper.desagil.aps3.tindfy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistaTest {
    private Artista a;

    @BeforeEach
    void setUp() {
        a = new Artista(123, "Prince");
    }

    @Test
    void constroi() {
        assertEquals(123, a.getId());
        assertEquals("Prince", a.getNome());
    }

    @Test
    void mudaNome() {
        a.setNome("Artist Formerly Known as Prince");
        assertEquals("Artist Formerly Known as Prince", a.getNome());
    }
}
