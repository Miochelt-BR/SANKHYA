package org.example;



    // Exceção personalizada para índice inválido
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coletions {

    // Exceção personalizada para índice inválido
    static class InvalidIndexException extends Exception {
        public InvalidIndexException(String message) {
            super(message);
        }
    }

    // Método para remover elemento da lista com base no índice
    public static void removeElementAtIndex(List<String> list, int index) throws InvalidIndexException {
        if (index < 0 || index >= list.size()) {
            throw new InvalidIndexException("Index " + index + " is out of bounds.");
        }
        list.remove(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        // Adicionando elementos à lista para teste
        list.add("Elemento1");
        list.add("Elemento2");
        list.add("Elemento3");
        list.add("Elemento4");

        while (true) {
            try {
                System.out.println("Lista atual: " + list);
                System.out.print("Informe o índice do elemento a ser removido: ");
                int index = scanner.nextInt();

                removeElementAtIndex(list, index);

                System.out.println("Elemento removido com sucesso.");
                System.out.println("Lista atualizada: " + list);

                break; // Sai do loop se a remoção for bem-sucedida
            } catch (InvalidIndexException e) {
                System.err.println(e.getMessage());
                System.out.println("Por favor, tente novamente com um índice válido.");
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
                System.out.println("Por favor, tente novamente.");
            }
        }

        scanner.close();
    }
}
