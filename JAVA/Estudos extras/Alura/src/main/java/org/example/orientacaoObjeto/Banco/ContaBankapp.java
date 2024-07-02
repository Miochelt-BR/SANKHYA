package org.example.orientacaoObjeto.Banco;

import org.example.orientacaoObjeto.Banco.ContaBancaria;

public class ContaBankapp {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Thiago", 1234, 1000.0, "corrente");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Tipo de conta: " + conta.getTipoDeConta());
    }
}
