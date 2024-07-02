package org.example.orientacaoObjeto;

public class Main {
    public static void main(String[] args) {
        Filmes filme = new Filmes();
        filme.setTitulo("O Filme");
        filme.setAno(2000);
        filme.setDuracao(120);

        System.out.println(filme.getTitulo());
        System.out.println(filme.getAno());
        System.out.println(filme.getDuracao());
    }
}
