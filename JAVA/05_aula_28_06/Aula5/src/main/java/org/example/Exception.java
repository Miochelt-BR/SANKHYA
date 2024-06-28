package org.example;

public class Exception {
    public static void main(String[] args) {
        try {
            //Código que pode lançar uma exceção
            int[] numeros = {1,2,3};
            System.out.println("O número na posição 4 é: " + numeros[3]);
            int resultado = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            //Tratamento da exceção
            System.out.println("Erro: Tentativa de acessar um índice fora dos limites do array.");
        } catch(ArithmeticException e){
            System.out.println("Erro: Tentativa de divisão por zero.");
        }
        System.out.println("O programa continua executando normalmente após o tratamento da exceção.");


    }
}

