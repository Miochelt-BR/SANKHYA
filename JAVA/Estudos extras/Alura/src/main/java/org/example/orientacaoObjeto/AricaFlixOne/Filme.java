package org.example.orientacaoObjeto.AricaFlixOne;

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getEpisodioPorTemporada() {
        return 0;
    }
}
