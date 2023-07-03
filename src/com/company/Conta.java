package com.company;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;

    public Conta(int numero, Cliente titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    };

    public int getNumero(int numero) {
        System.out.println("Número: " + this.numero);
        return this.numero;
    };
    public void setNumero(int numero) {
        this.numero = numero;
        System.out.println("Número: " + this.numero);
    };
    public Cliente getTitular(Cliente titular) {
        System.out.println("Titular: " + this.titular);
        return this.titular;
    };
    public double getSaldo(double saldo) {
        System.out.println("Saldo: " + this.saldo);
        return this.saldo;
    };
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo: " + this.saldo);
    };

    public Conta abrirConta(int numero, Cliente titular, double saldo) {
        Conta conta = new Conta(numero, titular, saldo);
        System.out.println("Conta aberta com sucesso!");
        return conta;
    };

    public void fecharConta() {
        if (this.saldo == 0) {
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("Conta não pode ser fechada!");
        };
    };

    public void saldoAtual() {
        System.out.println("Saldo atual: " + this.saldo);
    };

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    };

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor sacado: " + valor);
            return true;
        };
        System.out.println("Saldo insuficiente!");
        return false;
    };

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Valor transferido: " + valor);
            return true;
        };
        System.out.println("Transferência não realizada!");
        return false;
    };


};
