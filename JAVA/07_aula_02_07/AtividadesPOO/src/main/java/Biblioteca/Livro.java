package Biblioteca;

import java.util.Date;

class Livro extends ItemBiblioteca implements Emprestimo {
    private Genero genero;

    public Livro(String titulo, String autor, int anoPublicacao, Genero genero) {
        super(titulo, autor, anoPublicacao);
        this.genero = genero;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.5; // Exemplo de cálculo de multa
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
    }

    @Override
    public void emprestar(Date dataEmprestimo) {
        // Lógica de empréstimo
        System.out.println("Livro emprestado em: " + dataEmprestimo);
    }

    @Override
    public void devolver(Date dataDevolucao) {
        // Lógica de devolução
        System.out.println("Livro devolvido em: " + dataDevolucao);
    }
}