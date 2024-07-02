package org.example.ProjetoAlura;

import java.util.Scanner;

public class Main {





        private static final String ADMIN_NOME = "admin";
        private static final String ADMIN_SENHA = "1234";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            if (acessoAdmin(scanner)) {
                System.out.println("Acesso concedido ao administrador.");
                String nome = "Thiago";
                String TipoConta = "corrente";
                double saldo = 1000.0;
                int opcao = 0;

                System.out.println("-----------------------------------------------------");
                System.out.println("Nome do cliente: " + nome);
                System.out.println("Tipo da conta: " + TipoConta);
                System.out.println("Saldo da conta: " + saldo);
                System.out.println("-----------------------------------------------------");

                while (opcao != 4) {
                    System.out.println("\nMenu:");
                    System.out.println("1. Consultar saldo");
                    System.out.println("2. Depositar");
                    System.out.println("3. Retirar");
                    System.out.println("4. Sair");
                    System.out.print("Escolha uma opção: ");
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("Saldo atual: " + saldo);
                            break;
                        case 2:
                            System.out.print("Digite o valor para depósito: ");
                            double deposito = scanner.nextDouble();
                            saldo += deposito;
                            System.out.println("Depósito realizado. Novo saldo: " + saldo);
                            break;
                        case 3:
                            System.out.print("Digite o valor para retirada: ");
                            double retirada = scanner.nextDouble();
                            if (retirada <= saldo) {
                                saldo -= retirada;
                                System.out.println("Retirada realizada. Novo saldo: " + saldo);
                            } else {
                                System.out.println("Saldo insuficiente para retirada.");
                            }
                            break;
                        case 4:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            } else {
                System.out.println("Acesso negado.");
            }
            scanner.close();
        }

        private static boolean acessoAdmin(Scanner scanner) {
            System.out.print("Digite o nome de usuário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            return ADMIN_NOME.equals(nome) && ADMIN_SENHA.equals(senha);
        }
    }


