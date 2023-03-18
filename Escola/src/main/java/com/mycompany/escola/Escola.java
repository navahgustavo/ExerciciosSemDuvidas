package com.mycompany.escola;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class Escola {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];
        Turma[] turmas = new Turma[2];
        
        String nome;
        int ra;
        char sexo;
        double media;
        boolean situacao;
        
        String curso;
        int periodo;
        char classe;
        Aluno aluno = null;
        
        System.out.println("Bom dia, cadastre os alunos: ");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastro "+(i+1)+"/3");
            
            ra = i+1;
            System.out.println("RA nº: "+ra);
            System.out.print("Informe o nome do aluno: ");
            nome = ler.nextLine();
            alunos[i] = new Aluno(nome, ra);
            
            System.out.print("Informe o sexo (M/F): ");
            sexo = ler.nextLine().charAt(0);
            Character.toUpperCase(sexo);
            alunos[i].setSexo(sexo);
            
            System.out.print("Informe a media do aluno: ");
            media = ler.nextDouble();
            alunos[i].setMedia(media);
            
            System.out.print("Informe se a matrícula do aluno está ativa: ");
            char confirmacao = ler.next().charAt(0);
            Character.toUpperCase(confirmacao);
            if (confirmacao == 'S') {
                situacao = true;
            } else {
                situacao = false;
            }
            alunos[i].setSituacao(situacao);
            
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("Agora iremos para o cadastro de turmas: ");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Cadastro "+(i+1)+"/2");
            
            System.out.print("Informe o nome do curso: ");
            curso = ler.next();
            
            System.out.print("Informe o período (1, 2, 3...): ");
            periodo = ler.nextInt();
            
            System.out.print("Informe a turma (A, B, C...): ");
            classe = ler.next().charAt(0);
            Character.toUpperCase(classe);
            
            System.out.println("Informe o RA do aluno matriculado: ");  
            boolean correto = false;
            int raAluno;
            while (correto == false) {
                raAluno = ler.nextInt();
                for (int j = 0; j < 3; j++) {
                    if (raAluno == alunos[j].getRa()) {
                        aluno = alunos[j];
                        correto = true;
                    }
                }
            }
            
            turmas[i] = new Turma(curso, periodo, classe, aluno);
            System.out.println("--------------------------------------------------");
        }
        
        for (int i = 0; i < 1; i++) {
            System.out.println("--------------------------------------------------");
            System.out.println("|| Turma "+(i+1)+" ||");
            System.out.println("Curso: "+turmas[i].getCurso());
            System.out.println("Período: "+turmas[i].getPeriodo());
            System.out.println("Classe: "+turmas[i].getTurma());
            System.out.println("");
            System.out.println("Nome Aluno: "+turmas[i].getAluno().getNome());
            System.out.println("RA: "+turmas[i].getAluno().getRa());
            System.out.println("Sexo: "+turmas[i].getAluno().getSexo());
            System.out.println("Media: "+turmas[i].getAluno().getMedia());
            System.out.println("Situacao: "+turmas[i].getAluno().situacaoMatricula());
        }
        
    }
}
