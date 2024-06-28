package org.example;

import java.util.Scanner;




    public class Banco {
        private static final String ADMIN_NOME = "admin";
        private static final String ADMIN_SENHA = "1234";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            if (acessoAdmin(scanner)) {
                System.out.println("Acesso concedido ao administrador.");
                abrirMenu(scanner);
            } else {
                System.out.println("Acesso negado.");
            }
            scanner.close();
        }

        public static boolean acessoAdmin(Scanner scanner) {
            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String senha = scanner.nextLine();

            return ADMIN_NOME.equals(nome) && ADMIN_SENHA.equals(senha);
        }

        public static void abrirMenu(Scanner scanner) {
            int opcao;
            do {
                menuOPTIONS();
                opcao = scanner.nextInt();
                scanner.nextLine();  // Consumir a nova linha

                switch (opcao) {
                    case 1:
                        System.out.println("Banco aberto.");
                        break;
                    case 2:
                        System.out.println("Banco fechado.");
                        break;
                    case 3:
                        adicionarCliente(scanner);
                        break;
                    case 4:
                        removerCliente(scanner);
                        break;
                    case 5:
                        atualizarCliente(scanner);
                        break;
                    case 6:
                        adicionarConta(scanner);
                        break;
                    case 7:
                        removerConta(scanner);
                        break;
                    case 8:
                        atualizarConta(scanner);
                        break;
                    case 9:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }
            } while (opcao != 9);
        }

        public static void menuOPTIONS() {
            System.out.println("Opções:");
            System.out.println("1. Abrir banco");
            System.out.println("2. Fechar banco");
            System.out.println("3. Adicionar cliente");
            System.out.println("4. Remover cliente");
            System.out.println("5. Atualizar cliente");
            System.out.println("6. Adicionar conta");
            System.out.println("7. Remover conta");
            System.out.println("8. Atualizar conta");
            System.out.println("9. Sair");
        }

        public static void adicionarCliente(Scanner scanner) {
            System.out.println("Adicionar cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite seu email:");
            String emailCliente = scanner.nextLine();
            System.out.println("Digite seu CPF:");
            int cpfCliente = scanner.nextInt();
            System.out.println("Digite seu saldo:");
            double saldoCliente = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Cliente adicionado com sucesso! Nome: " + nomeCliente + " Email: " + emailCliente + " Saldo: " + saldoCliente);
        }

        public static void removerCliente(Scanner scanner) {
            System.out.println("Remover cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Cliente removido com sucesso!");
        }

        public static void atualizarCliente(Scanner scanner) {
            System.out.println("Atualizar cliente:");
            String nomeCliente = scanner.nextLine();
            System.out.println("Digite seu novo email:");
            String emailCliente = scanner.nextLine();
            System.out.println("Digite seu novo CPF:");
            int cpfCliente = scanner.nextInt();
            System.out.println("Digite seu novo saldo:");
            double saldoCliente = scanner.nextDouble();
            scanner.nextLine();  // Consumir a nova linha
            System.out.println("Cliente atualizado com sucesso!");
        }

        public static void adicionarConta(Scanner scanner) {
            System.out.println("Adicionar conta:");
            System.out.println("Digite o nome da conta:");
            String nomeConta = scanner.nextLine();
            System.out.println("Digite o saldo da conta:");
            double saldoConta = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Conta adicionada com sucesso!");
        }

        public static void removerConta(Scanner scanner) {
            System.out.println("Remover conta:");
            System.out.println("Digite o nome da conta:");
            String nomeConta = scanner.nextLine();
            System.out.println("Conta removida com sucesso!");
        }

        public static void atualizarConta(Scanner scanner) {
            System.out.println("Atualizar conta:");
            System.out.println("Digite o nome da conta:");
            String nomeConta = scanner.nextLine();
            System.out.println("Digite o saldo da conta:");
            double saldoConta = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Conta atualizada com sucesso!");
        }
    }
