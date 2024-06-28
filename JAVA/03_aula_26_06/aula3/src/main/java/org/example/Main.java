package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




                int[] a;
                int[] b = new int[10];
                int[] c = {1, 2, 3, 4, 5};
                String[] nomes = {"Douglas", "Dennys"};

                // Modify the first element of the nomes array
                nomes[0] = "Luciana";

                // Print the entire nomes array
                System.out.println(Arrays.toString(nomes));

                // Initialize and print another array
                int[] numeros = {1, 2, 3, 4, 5};
                System.out.println(Arrays.toString(numeros));

                // Print each element of numeros
                for (int elemento : numeros) {
                    System.out.println(elemento);
                }

                // Print each element of nomes
                for (String elemento : nomes) {
                    System.out.println(elemento);
                }

                // Calculate and print the average of the elements in numeros
                double media;
                int soma = 0;
                for (int elemento : numeros) {
                    soma += elemento;
                }
                media = (double) soma / numeros.length;
                System.out.println("A média dos elementos: " + media);

                // Add a new element to numeros
                int novoElemento = 7;
                int novoTamanho = numeros.length + 1;
                int[] numeros2 = new int[novoTamanho];
                for (int i = 0; i < numeros.length; i++) {
                    numeros2[i] = numeros[i];
                }
                numeros2[novoTamanho - 1] = novoElemento;
                System.out.println("Novo Array: " + Arrays.toString(numeros2));

                // Remove an element from numeros
                int elementoParaRemover = 3;
                int[] numeros3 = new int[numeros.length - 1];
                int indiceNumeros3 = 0;
                for (int i = 0; i < numeros.length; i++) {
                    if (numeros[i] != elementoParaRemover) {
                        numeros3[indiceNumeros3] = numeros[i];
                        indiceNumeros3++;
                    }
                }
                numeros = numeros3;
                System.out.println("Novo Array: " + Arrays.toString(numeros));

                // Copy elements from one array to another
                int[] numerosOrigem = {1, 2, 3, 4, 5};
                int[] numerosDestino = new int[5];
                System.arraycopy(numerosOrigem, 0, numerosDestino, 0, numerosOrigem.length);
                System.out.println(Arrays.toString(numerosDestino));

                // Copy an array with additional space
                int[] arrayOriginal = {1, 2, 3, 4, 5};
                int[] arrayCopiado = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 3);
                System.out.println("Array copiado: " + Arrays.toString(arrayCopiado));

                // Convert an array of integers to an array of doubles
                int[] arrayInteiros = {1, 2, 3, 4, 5};
                double[] arrayDoubles = new double[arrayInteiros.length];
                for (int i = 0; i < arrayInteiros.length; i++) {
                    arrayDoubles[i] = arrayInteiros[i];
                }
                System.out.println("Array de doubles após cópia: " + Arrays.toString(arrayDoubles));

                // Convert an array of integers to an array of strings
                String[] arrayStrings = new String[arrayInteiros.length];
                for (int i = 0; i < arrayInteiros.length; i++) {
                    arrayStrings[i] = String.valueOf(arrayInteiros[i]);
                }
                System.out.println("Array de strings após cópia: " + Arrays.toString(arrayStrings));

                // Convert an array of strings to an array of integers
                String[] arrayStrings2 = {"10", "20", "30", "40", "50"};
                int[] arrayInteiros2 = new int[arrayStrings2.length];
                for (int i = 0; i < arrayStrings2.length; i++) {
                    arrayInteiros2[i] = Integer.parseInt(arrayStrings2[i]);
                }
                System.out.println("Array de inteiros após cópia: " + Arrays.toString(arrayInteiros2));
            }
        }


