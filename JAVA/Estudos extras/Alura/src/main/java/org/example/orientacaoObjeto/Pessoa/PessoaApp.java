package org.example.orientacaoObjeto.Pessoa;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Thiago", 20, "Av. Paulista, 1000");
        pessoa.idade(20);
        Pessoa pessoa2 = new Pessoa("Thiago", 20, "Av. Paulista, 1000");
        pessoa2.idade(15);
    }
}
