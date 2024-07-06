package org.example.orientacaoObjeto.ExercicioCurso2.carro.carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Carro {
    private List<Double> precos;

    public Carro() {
        this.precos = new ArrayList<>();
    }

    public void adicionarPreco(double preco) {
        precos.add(preco);
    }

    public void exibirMenorMaiorPreco() {
        if (precos.isEmpty()) {
            System.out.println("Nenhum preço foi adicionado.");
            return;
        }
        double menorPreco = Collections.min(precos);
        double maiorPreco = Collections.max(precos);
        System.out.printf("Menor preço: R$%.2f%n", menorPreco);
        System.out.printf("Maior preço: R$%.2f%n", maiorPreco);
    }
}
