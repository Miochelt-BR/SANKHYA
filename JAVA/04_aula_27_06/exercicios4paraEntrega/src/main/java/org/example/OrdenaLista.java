package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdenaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite a quantidade de números na lista:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite os números:");

        for (int i = 0; i < quantidade; i++) {
            lista.add(scanner.nextInt());
        }

        System.out.println("Escolha o tipo de ordenação:");
        System.out.println("1. Crescente");
        System.out.println("2. Decrescente");
        int opcao = scanner.nextInt();

        ArrayList<Integer> listaOrdenada;
        if (opcao == 1) {
            listaOrdenada = ordenaListaCrescente(lista);
        } else {
            listaOrdenada = ordenaListaDecrescente(lista);
        }

        System.out.println("Lista ordenada: " + listaOrdenada);
    }

    // Método para ordenar uma lista de números inteiros em ordem crescente usando Bubble Sort
    public static ArrayList<Integer> ordenaListaCrescente(ArrayList<Integer> lista) {
        int tamanho = lista.size();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    // Troca os elementos
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }

    // Método para ordenar uma lista de números inteiros em ordem decrescente usando Bubble Sort
    public static ArrayList<Integer> ordenaListaDecrescente(ArrayList<Integer> lista) {
        int tamanho = lista.size();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (lista.get(j) < lista.get(j + 1)) {
                    // Troca os elementos
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }
}
