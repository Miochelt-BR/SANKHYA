package org.example.orientacaoObjeto.Banco;

public class ContaBancaria {
    private String nome;
    private int numero;
    private double saldo;
    private String tipoDeConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public ContaBancaria(String nome, int numero, double saldo, String tipoDeConta) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;

    }

}
