package com.mycompany.campeonatofutebol;

/**
 *
 * @author aluno
 */
public class Jogador {
    
    private String nome;
    private int idade;
    private String posicao;
    private int numero;
    private double salario;

    public Jogador(String nome, int idade, String posicao, int numero, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numero = numero;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
