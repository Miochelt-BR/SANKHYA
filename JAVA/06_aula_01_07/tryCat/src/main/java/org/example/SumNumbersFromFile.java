package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




    // Exceção para arquivo não encontrado
class FileNotFoundException extends Exception {
    public FileNotFoundException(String message) {
        super(message);
    }
}



        class InvalidNumberFormatException extends Exception {
            public InvalidNumberFormatException(String message) {
                super(message);
            }
        }

public class SumNumbersFromFile {

            public static void main(String[] args) {
                String filePath = "c://Users//Thiago//Desktop//numero.txt"; // Substitua pelo caminho do seu arquivo

                try {
                    int sum = readAndSumNumbers(filePath);
                    System.out.println("A soma dos números é: " + sum);
                } catch (FileNotFoundException | InvalidNumberFormatException e) {
                    System.err.println(e.getMessage());
                }
            }

            public static int readAndSumNumbers(String filePath) throws FileNotFoundException, InvalidNumberFormatException {
                int sum = 0;

                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        try {
                            int number = Integer.parseInt(line);
                            sum += number;
                        } catch (NumberFormatException e) {
                            throw new InvalidNumberFormatException("Linha inválida no arquivo: " + line);
                        }
                    }
                } catch (IOException e) {
                    throw new FileNotFoundException("Arquivo não encontrado: " + filePath);
                }

                return sum;
            }
        }








