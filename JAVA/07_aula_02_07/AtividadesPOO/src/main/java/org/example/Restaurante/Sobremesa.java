package org.example.Restaurante;


public class Sobremesa extends Refeicao {
        public Sobremesa(String nome, double preco) {
            super(nome, preco);
        }

        @Override
        public void preparar() {
            System.out.println("Preparando a sobremesa: " + getNome());
        }
    }

