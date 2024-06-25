package org.example;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        //1. Escreva um programa que verifica se um número é positivo, negativo ou zero.

        System.out.println("Digite um número: ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo");
        } else if (numero < 0) {
            System.out.println("O numero é negativo");
        } else {
            System.out.println("O numero é zero");
        }

    }
}