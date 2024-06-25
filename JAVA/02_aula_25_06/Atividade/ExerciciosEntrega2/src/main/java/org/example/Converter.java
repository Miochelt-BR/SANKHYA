package org.example;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        // 8. Escreva um programa que converte um número decimal em binário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int bin = 0;
        while (num > 0) {
            bin = bin * 10 + num % 2;
            num = num / 2;
        }
        System.out.println("Binário: " + bin);
    }

}
