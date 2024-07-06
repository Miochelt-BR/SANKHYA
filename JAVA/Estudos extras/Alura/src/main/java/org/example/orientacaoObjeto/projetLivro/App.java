package org.example.orientacaoObjeto.projetLivro;

public class App {
    public static void main(String[] args) {
        ProdutoFisico produto = new ProdutoFisico();
        produto.setTitulo("Livro");
        produto.setAno(2021);
        produto.setPreco(100.00);



        System.out.println("Preco final do livro: " + produto.calcularPrecoFinal(10));
      


    }
}
