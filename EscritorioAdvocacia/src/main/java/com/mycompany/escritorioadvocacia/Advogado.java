package com.mycompany.escritorioadvocacia;

/**
 *
 * @author Gustavo H. Nava
 */
public class Advogado {
    
    public String nome;
    public int cadastroOab;
    
    private int anosAtuacao;
    private String especialidade;
    private String graduacao;
    private double valorHora;
    private double salario;

    public Advogado(String nome, int cadastroOab) {
        this.nome = nome;
        this.cadastroOab = cadastroOab;
    }

    public int getAnosAtuacao() {
        return anosAtuacao;
    }

    public void setAnosAtuacao(int anosAtuacao) {
        this.anosAtuacao = anosAtuacao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
