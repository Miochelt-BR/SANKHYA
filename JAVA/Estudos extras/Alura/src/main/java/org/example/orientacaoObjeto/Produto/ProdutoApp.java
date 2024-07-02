package org.example.orientacaoObjeto.Produto;

public class ProdutoApp {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 1000, 10);
        produto.precoDesconto(produto.getPreco());
        Produto produto2 = new Produto("Notebook", 1000, 10);
        produto2.precoDesconto(produto2.getPreco());
        System.out.println(produto.getPreco());
        System.out.println(produto2.getPreco());
        System.out.println(produto.getQuantidade());
        System.out.println( produto2.precoDesconto(produto2.getPreco()));

    }

}
