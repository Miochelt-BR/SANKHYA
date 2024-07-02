package org.example.orientacaoObjeto.AricaFlixOne;

import org.example.orientacaoObjeto.calculadora.CalculadoraDeTempo;

public class AricaFlix {
    public static void main(String[] args) {
        Serie serie = new Serie();
        serie.setNome("suits");
        serie.setAnoDeLancamento(1999);
        serie.setDuracaoEmMinutos(170);
        serie.setIncluidoNoPlano(true);
        serie.setDuracaoEmMinutos(170);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(10);
        System.out.println(serie.getNome() + " " + serie.getAnoDeLancamento() + " " + serie.getDuracaoEmMinutos() + " " + serie.isIncluidoNoPlano() + " " + serie.getEpisodioPorTemporada() + " " + serie.getMinutosPorEpisodio() );   //getEpisodioPorTemporada() é o que deveria ser retornado

        System.out.println(serie.getNome() + " " + serie.getAnoDeLancamento() + " " + serie.getDuracaoEmMinutos() + " " + serie.isIncluidoNoPlano() + " " + serie.getEpisodioPorTemporada() + " " + serie.getMinutosPorEpisodio()); //getEpisodioPorTemporada() é o que deveria ser retornado

        Filme filme = new Filme();
        filme.setNome("O Filme homem aranha");
        filme.setAnoDeLancamento(2000);
        filme.setDuracaoEmMinutos(120);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(120);
        filme.setDuracaoEmMinutos(120);
        filme.setDiretor("Thiago Santos");
        System.out.println(filme.getNome() + " " + filme.getAnoDeLancamento() + " " + filme.getDuracaoEmMinutos() + " " + filme.isIncluidoNoPlano() + " " +  " " + filme.getDiretor());



        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
            filme2.setAnoDeLancamento(2009);
            filme2.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println("Tempo total em Minutos"+calculadora.getTempoTotal());
        calculadora.inclui(filme2);
        System.out.println("Tempo total em Minutos"+calculadora.getTempoTotal());

    }

}
