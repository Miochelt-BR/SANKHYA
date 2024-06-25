package org.example;

import java.util.Scanner;

public class Palimdromo {
    public static void main(String[] args) {
        //9. Escreva um programa que verifica se uma string é um palíndromo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palimdromo = sc.nextLine();
        String reverse = palimdromo.substring(0, palimdromo.length() / 2);
        if (palimdromo.equals(reverse)) {
            System.out.println("String é palíndromo");
        } else {
            System.out.println("String não é palíndromo");
        }

            }
        }


