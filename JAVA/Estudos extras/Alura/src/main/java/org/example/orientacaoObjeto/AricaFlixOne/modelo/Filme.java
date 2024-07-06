package org.example.orientacaoObjeto.AricaFlixOne.modelo;

import org.example.orientacaoObjeto.AricaFlixOne.Titulo;
import org.example.orientacaoObjeto.AricaFlixOne.calculadora.Classificavel;

public class Filme extends Titulo implements Classificavel {
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


    @Override
    public int getclassificacao() {
        return (int) pegaAMedia()/2;

    }
}
