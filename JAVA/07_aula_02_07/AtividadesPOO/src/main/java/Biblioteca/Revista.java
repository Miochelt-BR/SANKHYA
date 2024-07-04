package Biblioteca;

import java.util.Date;

class Revista extends ItemBiblioteca implements Emprestimo {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.0; // Exemplo de cálculo de multa
    }

    @Override
    public void imprimirDetalhes() {
        System.out.println("Revista:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Edição: " + edicao);
    }

    @Override
    public void emprestar(Date dataEmprestimo) {
        // Lógica de empréstimo
        System.out.println("Revista emprestada em: " + dataEmprestimo);
    }

    @Override
    public void devolver(Date dataDevolucao) {
        // Lógica de devolução
        System.out.println("Revista devolvida em: " + dataDevolucao);
    }
}