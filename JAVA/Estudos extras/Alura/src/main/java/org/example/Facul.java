package org.example;

import java.util.Scanner;

public class Facul {
    public static void main(String[] args) {
        double media = 0;
        double nota=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Insira a nota do aluno " );
            nota = sc.nextDouble();
            media += + nota;

        }
        System.out.println("A média é " + media / 3);
    }
}
