package com.company;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;

    public int getNumero(int numero) {
        System.out.println("Número: " + this.numero);
        return this.numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
        System.out.println("Número: " + this.numero);
    }
    public Cliente getTitular(Cliente titular) {
        System.out.println("Titular: " + this.titular);
        return this.titular;
    }


    public double getSaldo(double saldo) {
        System.out.println("Saldo: " + this.saldo);
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo: " + this.saldo);
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Valor sacado: " + valor);
            return true;
        }
        System.out.println("Saldo insuficiente!");
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("Valor transferido: " + valor);
            return true;
        }
        System.out.println("Transferência não realizada!");
        return false;
    }


}
