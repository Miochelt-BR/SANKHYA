package org.example.curso1;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("OLA SEJA BEM VINDO AO ANALIZADOR DE FILMES");
        System.out.println("Digite o nome do filme: ");
        String filme = sc.nextLine();
        System.out.println("Digite o ano do filme: ");
        int ano = sc.nextInt();
        System.out.println("Digite o diretor do filme: ");
        String diretor = sc.nextLine();
        System.out.println("Digite o gênero do filme: ");
        String genero = sc.nextLine();
        System.out.println("Digite a classificação do filme: ");
        int classificacao = sc.nextInt();
        System.out.println("O filme " + filme + " do ano " + ano + " foi direto por " + diretor + " e tem a classificação de " + classificacao + " com " + genero);

    }
}
