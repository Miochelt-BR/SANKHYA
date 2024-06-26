package org.example;



public class Matriz {
    public static void main(String[] args) {
        // Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Imprime alguns elementos da matriz para verificação
        System.out.println(matriz[0][0]); // Saída: 1
        System.out.println(matriz[1][1]); // Saída: 5
        System.out.println(matriz[2][2]); // Saída: 9

        // Chama o método pesquisarElemento e imprime o resultado
        System.out.println(pesquisarElemento(matriz, 9)); // Saída: Elemento encontrado na posição: (1, 1)
        System.out.println(pesquisarElemento(matriz, 10)); // Saída: Elemento não encontrado
    }

    public static String pesquisarElemento(int[][] matriz, int elemento) {
        // Percorre cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            // Percorre cada coluna da matriz
            for (int j = 0; j < matriz[i].length; j++) {
                // Verifica se o elemento na posição atual é igual ao elemento buscado
                if (matriz[i][j] == elemento) {
                    // Retorna a posição do elemento encontrado no formato (linha, coluna)
                    return "Elemento encontrado na posição: (" + i + ", " + j + ")";
                }
            }

        }
        return "Elemento não encontrado";
    }
}