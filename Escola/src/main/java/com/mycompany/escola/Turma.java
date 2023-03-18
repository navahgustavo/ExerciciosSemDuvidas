package com.mycompany.escola;

/**
 *
 * @author Gustavo H. Nava
 */
public class Turma {
    
    private String curso;
    private int periodo;
    private char classe;
    private Aluno aluno;
    
    public Turma(String curso, int periodo, char classe, Aluno aluno) {
        this.curso = curso;
        this.periodo = periodo;
        this.classe = classe;
        this.aluno = aluno;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
    public char getTurma() {
        return classe;
    }
    
    public void setTurma(char classe) {
        this.classe = classe;
    }
    
    public Aluno getAluno() {
        return aluno;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
