package com.company;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private int idade;

    public String getNome(String nome) {
        System.out.println("Nome: " + this.nome);
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + this.nome);
    }
    public String getCpf(String cpf) {
        System.out.println("CPF: " + this.cpf);
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
        System.out.println("CPF: " + this.cpf);
    }
    public String getProfissao(String profissao) {
        System.out.println("Profissão: " + this.profissao);
        return this.profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
        System.out.println("Profissão: " + this.profissao);
    }
    public int getIdade(int idade) {
        System.out.println("Idade: " + this.idade);
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
        System.out.println("Idade: " + this.idade);
    }


}
