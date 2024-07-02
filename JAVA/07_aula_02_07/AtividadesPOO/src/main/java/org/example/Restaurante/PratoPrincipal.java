package org.example.Restaurante;

public class PratoPrincipal extends Refeicao {

        public PratoPrincipal(String nome, double preco) {
            super(nome, preco);
        }

        @Override
        public void preparar() {
            System.out.println("Preparando o prato principal: " + getNome());
        }
    }


