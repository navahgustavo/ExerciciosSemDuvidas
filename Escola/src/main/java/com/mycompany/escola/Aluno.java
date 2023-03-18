package com.mycompany.escola;

/**
 *
 * @author Gustavo H. Nava
 */
public class Aluno {
    
    private String nome;
    private int ra;
    private char sexo;
    private double media;
    private boolean situacao;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public int getRa() {
        return ra;
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
    public String situacaoMatricula() {
        if (situacao == true) {
            return "Ativo";
        } else {
            return "Inativo";   
        }
    }
    
}
