package org.example;

import java.util.Scanner;


    public class Contato {

        // Método para imprimir os dados do contato
        public static void imprimir(String nome, String endereco, String telefone) {
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone: " + telefone);
        }

        // Método principal para testar a classe
        public static void main(String[] args) {
            // Criando um objeto Scanner para ler a entrada do usuário
            Scanner scanner = new Scanner(System.in);

            // Solicitando o nome
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            // Solicitando o endereço
            System.out.print("Digite o endereço: ");
            String endereco = scanner.nextLine();

            // Solicitando o telefone
            System.out.print("Digite o telefone: ");
            String telefone = scanner.nextLine();

            // Imprimindo os dados do contato
            imprimir(nome, endereco, telefone);

            // Fechando o scanner
            scanner.close();
        }

}