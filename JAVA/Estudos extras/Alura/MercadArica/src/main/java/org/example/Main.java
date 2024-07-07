package org.example;

import org.example.mercado.Produto;
import org.example.mercado.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produtos1 = new Produto("Samsung", 100, 10);
        Produto produtos2 = new Produto("Apple", 200, 10);
        Produto produtos3 = new Produto("Sony", 300, 10);
        listaProdutos.add(produtos1);
        listaProdutos.add(produtos2);
        listaProdutos.add(produtos3);

        Produto produtos4 = new Produto("Samsung", 100, 10);
        Produto produtos5 = new Produto("Apple", 200, 10);
        Produto produtos6 = new Produto("Sony", 300, 10);
        listaProdutos.add(produtos4);
        listaProdutos.add(produtos5);
        listaProdutos.add(produtos6);

        Produto produtos7 = new Produto("Samsung", 100, 10);
        Produto produtos8 = new Produto("Apple", 200, 10);
        Produto produtos9 = new Produto("Sony", 300, 10);
        listaProdutos.add(produtos7);
        listaProdutos.add(produtos8);
        listaProdutos.add(produtos9);

        Produto produtos10 = new Produto("Samsung", 100, 10);
        Produto produtos11 = new Produto("Apple", 200, 10);
        Produto produtos12 = new Produto("Sony", 300, 10);
        listaProdutos.add(produtos10);
        ProdutoPerecivel produtos13 = new ProdutoPerecivel("Samsung", 100, 10, "01/01/2022");
        ProdutoPerecivel produtos14 = new ProdutoPerecivel("Apple", 200, 10, "01/01/2022");
        ProdutoPerecivel produtos15 = new ProdutoPerecivel("Sony", 300, 10, "01/01/2022");
        listaProdutos.add(produtos13);
        listaProdutos.add(produtos14);
        listaProdutos.add(produtos15);
        listaProdutos.add(produtos11);
        listaProdutos.add(produtos12);
        System.out.println(listaProdutos);
        System.out.println(listaProdutos.get(0));
        System.out.println(listaProdutos.get(1));
        System.out.println(listaProdutos.get(2));
        System.out.println(listaProdutos.get(3));
        System.out.println(listaProdutos.get(4));


    }


}