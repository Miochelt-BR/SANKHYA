package org.example;

import java.util.Scanner;

public class FatorialAchar {
    public static void main(String[] args) {
        //10. Escreva um programa que calcula o fatorial de um número fornecido pelo usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
