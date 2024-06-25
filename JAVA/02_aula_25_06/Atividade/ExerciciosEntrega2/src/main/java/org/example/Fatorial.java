package org.example;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Fecha o scanner
        scanner.close();

        // Encontra e imprime os fatores do número
        System.out.println("Os fatores de " + numero + " são:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}