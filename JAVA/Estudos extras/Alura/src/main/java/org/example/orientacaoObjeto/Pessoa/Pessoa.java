package org.example.orientacaoObjeto.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }
    public void idade(int idade){
        idade = idade;
        if(idade > 18){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Crianca");
        }
    }
}
