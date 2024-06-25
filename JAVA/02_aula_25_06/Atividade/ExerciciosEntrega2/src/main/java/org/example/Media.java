package org.example;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        //2. Escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.
        System.out.println("Digite um número: ");
   Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero3 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero4 = scanner.nextInt();

        double media = (numero + numero2 + numero3 + numero4) / 4;
        System.out.println("A média é " + media);
    }
}
