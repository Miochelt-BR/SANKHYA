package org.example.orientacaoObjeto.Escola;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;
    private String endereco;
    private int sala;
    private double nota;
    private ArrayList<Double> notas;

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

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno(String nome, int idade, String endereco, int sala, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.sala = sala;
        this.nota = nota;

    }
    public double getNota( double nota1, double nota2, double nota3, double nota4){
        nota = (nota1 + nota2 + nota3 + nota4) / 4;
        return nota;
    }
}
