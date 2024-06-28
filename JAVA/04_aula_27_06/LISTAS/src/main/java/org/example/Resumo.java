package org.example;

import java.util.*;

public class Resumo {


        {

                // Cria um ArrayList de Strings para armazenar nomes de alunos
                ArrayList<String> alunos = new ArrayList<>();

                // Adiciona alunos ao ArrayList
                alunos.add("Anter");
                alunos.add("Pedro");

                // Adiciona "Sebastião" na posição 0, empurrando os demais elementos para a direita
                alunos.add(0, "Sebastião");

                // Adiciona "Lucas" no final da lista
                alunos.add("Lucas");

                // Imprime o conteúdo do ArrayList
                System.out.println(alunos);  // Output: [Sebastião, Anter, Pedro, Lucas]

                // Remove o elemento na posição 0 (que é "Sebastião")
                alunos.remove(0);

                // Imprime o conteúdo do ArrayList após a remoção
                System.out.println(alunos);  // Output: [Anter, Pedro, Lucas]

                // Obtém o valor no índice 0 (comentado no código original)
                // String valor = alunos.get(0);

                // Cria uma lista de novos alunos usando Arrays.asList
                List<String> novosAlunos = Arrays.asList("Thiago", "Luciana", "Douglas");

                // Adiciona todos os novos alunos ao ArrayList existente
                alunos.addAll(novosAlunos);

                // Imprime o conteúdo do ArrayList após adicionar novos alunos
                System.out.println(alunos);  // Output: [Anter, Pedro, Lucas, Thiago, Luciana, Douglas]

                // Cria um ArrayList de inteiros com capacidade inicial de 10 (comentado no código original)
                // ArrayList<Integer> lista = new ArrayList<>(10);

                // Imprime os índices e os elementos do ArrayList
                System.out.println("Índices e elementos da lista");
                for (int i = 0; i < alunos.size(); i++) {
                    System.out.println("Índice " + i + ": " + alunos.get(i));
                }

                // Cria um mapa para armazenar pares de índices originais e elementos
                Map<Integer, String> indiceElementoOriginal = new HashMap<>();

                // Preenche o mapa com os índices e elementos originais
                for (int i = 0; i < alunos.size(); i++) {
                    indiceElementoOriginal.put(i, alunos.get(i));
                }

                // Ordena a lista de alunos em ordem alfabética
                Collections.sort(alunos);

                // Imprime a lista de alunos ordenada
                System.out.println("Lista de alunos ordenada");
                for (String aluno : alunos) {
                    // Obtém o índice original do aluno
                    int indiceOriginal = getKeyFromValue(indiceElementoOriginal, aluno);
                    System.out.println("Índice " + indiceOriginal + ": " + aluno);
                }
            }

            // Método auxiliar para obter a chave (índice original) a partir de um valor (elemento aluno) dentro da lista alunos
            public static <K, V> K getKeyFromValue(Map<K, V> map, V value) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    if (entry.getValue().equals(value)) {
                        return entry.getKey();
                    }
                }
                return null;
            }
        }




