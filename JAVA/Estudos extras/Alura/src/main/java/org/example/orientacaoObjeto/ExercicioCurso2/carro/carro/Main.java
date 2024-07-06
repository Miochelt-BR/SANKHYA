package org.example.orientacaoObjeto.ExercicioCurso2.carro.carro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro("Modelo A");
        ModeloCarro carro2 = new ModeloCarro("Modelo B");
        ModeloCarro carro3 = new ModeloCarro("Modelo C");
        carro1.adicionarPreco(50000.0);
        carro1.adicionarPreco(45000.0);
        carro1.adicionarPreco(48000.0);
        carro2.adicionarPreco(60000.0);
        carro2.adicionarPreco(55000.0);
        carro2.adicionarPreco(58000.0);
        carro3.adicionarPreco(70000.0);
        carro3.adicionarPreco(65000.0);
        carro3.adicionarPreco(68000.0);

        carro1.exibirModelo();
        carro1.exibirMenorMaiorPreco();
    }
}