package com.mycompany.consultoriomedico;

/**
 *
 * @author Gustavo
 */
public class Sintoma {
    
    public String nome;
    public char gravidade;
    public boolean emergencial;
    public int fequencia;

    public Sintoma(String nome, char gravidade, boolean emergencial, int fequencia) {
        this.nome = nome;
        this.gravidade = gravidade;
        this.emergencial = emergencial;
        this.fequencia = fequencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGravidade(char gravidade) {
        this.gravidade = gravidade;
    }

    public void setEmergencial(boolean emergencial) {
        this.emergencial = emergencial;
    }

    public void setFequencia(int fequencia) {
        this.fequencia = fequencia;
    }
}
