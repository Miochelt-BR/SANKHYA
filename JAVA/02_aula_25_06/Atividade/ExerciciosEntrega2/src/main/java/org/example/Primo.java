package org.example;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        //5. Escreva um programa que verifica se um número fornecido pelo usuário é primo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(num + " é um número primo.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " é um número primo.");
                    break;
                }
            }   System.out.println(num + " é um número primo.");
            }
        }
    }

