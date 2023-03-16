package com.mycompany.consultoriomedico;

/**
 *
 * @author Gustavo
 */
public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private int altura;
    private Sintoma sintoma;

    public Paciente(String nome, int idade, double peso, int altura, Sintoma sintoma) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.sintoma = sintoma;
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }

    public void setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
    }
}
