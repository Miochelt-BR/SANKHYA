package org.example.Restaurante;

public  abstract class Refeicao {

        private String nome;
        private double preco;

        public Refeicao(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public abstract void preparar();

        public String toString() {
            return "Nome: " + nome + " Preco: " + preco;

        }


    }


