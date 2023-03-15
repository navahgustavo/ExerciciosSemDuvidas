package com.mycompany.campeonatofutebol;

/**
 *
 * @author aluno
 */
public class TimeFutebol {
    
    private String nomeTime;
    private String cidade;
    private String sigla;
    private int colocacao;
    private Jogador capitao;

    public TimeFutebol(String nomeTime, String cidade, String sigla, int colocacao, Jogador capitao) {
        this.nomeTime = nomeTime;
        this.cidade = cidade;
        this.sigla = sigla;
        this.colocacao = colocacao;
        this.capitao = capitao;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getColocacao() {
        return colocacao;
    }

    public void setColocacao(int colocacao) {
        this.colocacao = colocacao;
    }

    public Jogador getCapitao() {
        return capitao;
    }

    public void setCapitao(Jogador capitao) {
        this.capitao = capitao;
    }
    
    
    
}
