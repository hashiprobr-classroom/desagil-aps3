package br.edu.insper.desagil.aps3.tindfy;

public class CupidoMusical extends Cupido {
    @Override
    public boolean deuMatch(Usuario a, Usuario b) {
        return super.deuMatch(a, b) && temComum(a, b);
    }

    private boolean temComum(Usuario a, Usuario b) {
        for (Musica musica : a.getMusicas()) {
            if (b.jaAdicionou(musica)) {
                return true;
            }
        }
        return false;
    }
}
