package org.example;

import java.util.Scanner;

public class Calculadora {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Calculadora de Soma
    public static void main(String[] args) {
        System.out.println(soma(2, 3));

    }

    public static int soma(int a, int b) {
        System.out.println(a + b);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + " é " + result);
        return result;
    }
}