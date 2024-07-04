package Biblioteca;

import java.util.Date;

class DVD extends ItemBiblioteca implements Emprestimo {
    private String duracao;

    public DVD(String titulo, String autor, int anoPublicacao, String duracao) {
        super(titulo, autor, anoPublicacao);
        this.duracao = duracao;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2.0; // Exemplo de cálculo de multa
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("DVD:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Duração: " + duracao);
    }

    @Override
    public void emprestar(Date dataEmprestimo) {
        // Lógica de empréstimo
        System.out.println("DVD emprestado em: " + dataEmprestimo);
    }

    @Override
    public void devolver(Date dataDevolucao) {
        // Lógica de devolução
        System.out.println("DVD devolvido em: " + dataDevolucao);
    }
}