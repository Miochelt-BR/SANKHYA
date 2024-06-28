package org.example;

import java.util.Scanner;

public class ContadorNumeroVogais {
    public static void main(String[] args) {
       // 7. Escreva um programa que conta o número de vogais em uma frase fornecida pelo usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        int vogais = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = Character.toLowerCase(frase.charAt(i));
            if (letra == 'a' || letra == 'á' || letra == 'â' || letra == 'ã' || letra == 'à' ||
                    letra == 'e' || letra == 'é' || letra == 'ê' || letra == 'è' ||
                    letra == 'i' || letra == 'í' || letra == 'î' || letra == 'ì' ||
                    letra == 'o' || letra == 'ó' || letra == 'ô' || letra == 'õ' || letra == 'ò' ||
                    letra == 'u' || letra == 'ú' || letra == 'û' || letra == 'ù') {
                vogais++;
            }
        }
        System.out.println("Vogais: " + vogais);
    }
    }



