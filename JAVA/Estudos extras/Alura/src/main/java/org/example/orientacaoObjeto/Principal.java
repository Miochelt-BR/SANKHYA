package org.example.orientacaoObjeto;

import org.example.orientacaoObjeto.AricaFlixOne.calculadora.Classificavel;
import org.example.orientacaoObjeto.AricaFlixOne.calculadora.FiltroRecomendacao;
import org.example.orientacaoObjeto.AricaFlixOne.modelo.Episodio;
import org.example.orientacaoObjeto.AricaFlixOne.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filmes filme = new Filmes();
        filme.titulo = "O Filme";
        filme.anoDeLancamento = 2000;
        filme.avaliacao = 8.5;
        filme.avaliacoes = 10;
        filme.duracaoEmMinutos = 120;
        filme.incluindoNoPlano = true;
        System.out.println(filme.titulo + " " + filme.anoDeLancamento + " " + filme.avaliacao + " " + filme.avaliacoes + " " + filme.duracaoEmMinutos + " " + filme.incluindoNoPlano);


        Serie serie = new Serie();
        serie.setEpisodioPorTemporada(1);
        serie.setTemporada(1);
        serie.setAtiva(true);
        serie.setMinutosPorEpisodio(1);
        serie.setNome("Thiago");
        System.out.println(serie.getEpisodioPorTemporada());


        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra((Classificavel) filme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);

        System.out.println(episodio.getNumero());


    }
}
