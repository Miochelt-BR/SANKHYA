package org.example.ProdutT;

import org.example.ProdutT.model.Produto;

import java.util.ArrayList;

public class ProdutApp {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Escova de dente", 10.0));
        produtos.add(new Produto(" pao", 20.0));
        produtos.add(new Produto("Peixe", 30.0));
        produtos.add(new Produto("Batata", 40.0));
        produtos.add(new Produto("Tomate", 50.0));


        double somaPrecos = 0.0;
        for (Produto produto : produtos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / produtos.size();
        System.out.println("O preço médio dos produtos é: " + precoMedio);
    }
    }

