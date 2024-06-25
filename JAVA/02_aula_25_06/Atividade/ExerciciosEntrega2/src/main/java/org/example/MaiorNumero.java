package org.example;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
       // 6. Escreva um programa que encontra o maior número em uma lista de números fornecida pelo usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else {
            System.out.println("O maior número é " + num2);
        }   System.out.println("O maior número é " + num1 + " ou " + num2);
    }
}
