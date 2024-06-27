package org.example;

import java.util.ArrayList;

import java.util.ArrayList;

public class Palindromo {
    public static void main(String[] args) {
        // Cria uma lista de Strings
        ArrayList<String> lista = new ArrayList<>();
        lista.add("alo");
        lista.add("ovo");
        lista.add("pedrin");
        lista.add("didi");
        lista.add("moco");
        lista.add("fier");
        lista.add("gaster");
        lista.add("hoter");
        lista.add("inder");
        lista.add("jander");

        // Verifica se a lista de Strings é um palíndromo
        verificaPalindromo(lista);
    }

    // Método que verifica se uma lista de Strings é um palíndromo
    public static void verificaPalindromo(ArrayList<String> lista) {
        int tamanho = lista.size();
        for (int i = 0; i < tamanho / 2; i++) {
            // Compara Strings usando o método equals
            if (!lista.get(i).equals(lista.get(tamanho - i - 1))) {
                System.out.println("Não é palíndromo");
                return;
            }
        }
        System.out.println("É palíndromo");
    }
}
