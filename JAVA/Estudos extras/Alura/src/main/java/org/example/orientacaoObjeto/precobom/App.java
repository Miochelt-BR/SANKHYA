package org.example.orientacaoObjeto.precobom;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Livro");
        produto.setQuantidade(1);
        produto.setPreco(100.00);

        Servico servico = new Servico();
        servico.setNome("TV");
        servico.setQuantidade(1);
        servico.setPreco(1000.00);

        System.out.println("Preco final do livro: " + produto.calcularPrecoFinal(5, 10));
        System.out.println("Preco final  manutenção da  TV: " + servico.calcularPrecoFinal(5, 10));


    }
}
