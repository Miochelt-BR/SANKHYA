package org.example.ContaBater;

import org.example.ContaBater.model.InicialConta;

import java.util.ArrayList;

public class AppConta {
    public static void main(String[] args) {

            ArrayList<InicialConta> listaContas = new ArrayList<>();

            listaContas.add(new InicialConta(1, 1000));
            listaContas.add(new InicialConta(2, 2000));
            listaContas.add(new InicialConta(3, 3000));

            InicialConta contaComMaiorSaldo = null;

            for (InicialConta conta : listaContas) {
                if (contaComMaiorSaldo == null || conta.getSaldo() > contaComMaiorSaldo.getSaldo()) {
                    contaComMaiorSaldo = conta;
                }
            }


            if (contaComMaiorSaldo != null) {
                System.out.println("Conta com maior saldo: " + contaComMaiorSaldo);
            } else {
                System.out.println("Nenhuma conta encontrada");
            }
        }
    }

