package br.edu.insper.desagil.aps3.tindfy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupido {
    private Map<Integer, List<Integer>> likes;

    public Cupido() {
        this.likes = new HashMap<>();
    }

    public void daLike(int idA, int idB) {
        List<Integer> dados;

        if (likes.containsKey(idA)) {
            dados = likes.get(idA);
        } else {
            dados = new ArrayList<>();
            likes.put(idA, dados);
        }

        if (!dados.contains(idB)) {
            dados.add(idB);
        }
    }

    public boolean deuMatch(Usuario a, Usuario b) {
        int idA = a.getId();
        int idB = b.getId();
        return deuLike(idA, idB) && deuLike(idB, idA);
    }

    private boolean deuLike(int idA, int idB) {
        List<Integer> dados = likes.get(idA);
        return dados != null && dados.contains(idB);
    }
}
