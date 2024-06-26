package org.example;

import java.util.Scanner;

public class Hipercubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de hipercubos: ");
        int numHipercubos = scanner.nextInt();
        System.out.print("Digite o número de páginas: ");
        int numPaginas = scanner.nextInt();
        System.out.print("Digite o número de linhas: ");
        int numLinhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int numColunas = scanner.nextInt();

        int[][][][] matriz = new int[numHipercubos][numPaginas][numLinhas][numColunas];

        for (int i = 0; i < numHipercubos; i++) {
            for (int j = 0; j < numPaginas; j++) {
                for (int k = 0; k < numLinhas; k++) {
                    for (int l = 0; l < numColunas; l++) {
                        System.out.print("Digite o elemento [" + i + "][" + j + "][" + k + "][" + l + "]: ");
                        matriz[i][j][k][l] = scanner.nextInt();
                    }
                }
            }
        }

        System.out.println("Matriz preenchida:");
        for (int i = 0; i < numHipercubos; i++) {
            System.out.println("Hipercubo " + (i + 1) + ":");
            for (int j = 0; j < numPaginas; j++) {
                System.out.println("  Página " + (j + 1) + ":");
                for (int k = 0; k < numLinhas; k++) {
                    for (int l = 0; l < numColunas; l++) {
                        System.out.print(matriz[i][j][k][l] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }


        System.out.println("Qual o número que você deseja pesquisar? ");

        int numero = scanner.nextInt();

        String resposta = Hipercubo.pesquisa( matriz, numero);
        System.out.println(resposta);

        scanner.close();

    }

    public static String pesquisa(int[][][][] matriz, int elemento) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                for (int k = 0; k < matriz[i][j].length; k++) {

                    for (int l = 0; l < matriz[i][j][k].length; l++) {

                        if (matriz[i][j][k][l] == elemento) {

                            return "Elemento encontrado na posição ( Cubo " + ( i + 1 ) + ", Página " + (j + 1) + ", Linha " + (k + 1) + ", Coluna " + (l + 1) + ")";
                        }
                    }
                }
            }
        }
        return "Elemento não encontrado";

    }
}
