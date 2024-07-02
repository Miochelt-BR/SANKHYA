package org.example.orientacaoObjeto;

public class Principal {
    public static void main(String[] args) {
        Filmes filme = new Filmes();
        filme.titulo = "O Filme";
        filme.anoDeLancamento = 2000;
        filme.avaliacao = 8.5;
        filme.avaliacoes = 10;
        filme.duracaoEmMinutos = 120;
        filme.incluindoNoPlano = true;
        System.out.println(filme.titulo+" "+filme.anoDeLancamento+" "+filme.avaliacao+" "+filme.avaliacoes+" "+filme.duracaoEmMinutos+" "+filme.incluindoNoPlano);



    }
}