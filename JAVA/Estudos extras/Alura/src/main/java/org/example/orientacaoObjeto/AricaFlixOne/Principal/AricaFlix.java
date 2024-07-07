package org.example.orientacaoObjeto.AricaFlixOne.modelo;

import org.example.orientacaoObjeto.AricaFlixOne.calculadora.CalculadoraDeTempo;

import java.util.ArrayList;

public class AricaFlix {
    public static void main(String[] args) {
        Serie serie = new Serie("Suits" ,1997);

        serie.setAnoDeLancamento(1999);
        serie.setDuracaoEmMinutos(170);
        serie.setIncluidoNoPlano(true);
        serie.setDuracaoEmMinutos(170);
        serie.setEpisodioPorTemporada(10);
        serie.setMinutosPorEpisodio(10);
        System.out.println(serie.getNome() + " " + serie.getAnoDeLancamento() + " " + serie.getDuracaoEmMinutos() + " " + serie.isIncluidoNoPlano() + " " + serie.getEpisodioPorTemporada() + " " + serie.getMinutosPorEpisodio() );   //getEpisodioPorTemporada() é o que deveria ser retornado

        System.out.println(serie.getNome() + " " + serie.getAnoDeLancamento() + " " + serie.getDuracaoEmMinutos() + " " + serie.isIncluidoNoPlano() + " " + serie.getEpisodioPorTemporada() + " " + serie.getMinutosPorEpisodio()); //getEpisodioPorTemporada() é o que deveria ser retornado

        Filme filme = new Filme("o filme homem aranha",2000,"Thiago Santos");

        filme.setAnoDeLancamento(2000);
        filme.setDuracaoEmMinutos(120);
        filme.setIncluidoNoPlano(true);
        filme.setDuracaoEmMinutos(120);
        filme.setDuracaoEmMinutos(120);
        filme.setDiretor("Thiago Santos");
        System.out.println(filme.getNome() + " " + filme.getAnoDeLancamento() + " " + filme.getDuracaoEmMinutos() + " " + filme.isIncluidoNoPlano() + " " +  " " + filme.getDiretor());



        Filme filme2 = new Filme("Avatar" + filme.getAnoDeLancamento(),2009,"Thiago Santos");
       ;
            filme2.setAnoDeLancamento(2009);
            filme2.setDuracaoEmMinutos(120);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println("Tempo total em Minutos"+calculadora.getTempoTotal());
        calculadora.inclui(filme2);
        System.out.println("Tempo total em Minutos"+calculadora.getTempoTotal());
        var filme3 = new Filme( "filmeavatar",2009,"Thiago Santos");
        ;
        filme3.setAnoDeLancamento(2009);
        filme3.setDuracaoEmMinutos(120);
        filme3.avaliaFilme(10);
      ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filme);
        listaFilmes.add(filme2);
        listaFilmes.add(filme3);
        System.out.println("tamanho da lista "+listaFilmes.size());
        System.out.println("Primeiro filme "+listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);




    }

}
