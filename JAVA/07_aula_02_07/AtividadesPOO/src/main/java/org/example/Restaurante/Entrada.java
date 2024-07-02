package org.example.Restaurante;

public class Entrada extends Refeicao {
    public Entrada(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando a entrada: " + getNome());
    }
}







