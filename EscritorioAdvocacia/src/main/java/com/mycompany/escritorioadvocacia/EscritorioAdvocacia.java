package com.mycompany.escritorioadvocacia;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class EscritorioAdvocacia {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Advogado[] advogado = new Advogado[8];
        
        String nome;
        int cadastroOab;
    
        int anosAtuacao;
        String especialidade;
        String graduacao;
        double valorHora;
        double salario;
        
        System.out.println("Bom dia, cadastre os advogados: ");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Cadastro "+(i+1)+"/8");
            nome = "";
            cadastroOab = 0;
            while(nome.isEmpty() || nome.isBlank() || cadastroOab == 0 || cadastroOab < 0) {
                System.out.print("Informe o nome do Advogado: ");
                nome = ler.next();
                System.out.print("Informa o Nº de cadastro da OAB: ");
                cadastroOab = ler.nextInt();
                if (nome.isEmpty() || nome.isBlank() || cadastroOab == 0 || cadastroOab < 0) {
                    System.out.println("");
                    System.out.println("Favor informar o nome e o cadastro OAB do advogado corretamente.");
                    System.out.println("");
                }
            }
            advogado[i] = new Advogado(nome, cadastroOab);
            
            System.out.print("Quantos anos de atuação tem o advogado: ");
            anosAtuacao = ler.nextInt();
            advogado[i].setAnosAtuacao(anosAtuacao);
            
            System.out.print("Qual a especialidade de atuação do advogado: ");
            especialidade = ler.next();
            advogado[i].setEspecialidade(especialidade);
            
            System.out.print("Qual a faculdade de graduação do advogado: ");
            graduacao = ler.next();
            advogado[i].setGraduacao(graduacao);
            
            System.out.print("Qual o valor da hora do advogado: ");
            valorHora = ler.nextDouble();
            advogado[i].setValorHora(valorHora);
            
            System.out.print("Qual o salário do advogado: ");
            salario = ler.nextDouble();
            advogado[i].setSalario(salario);
            
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("|| Ultimos cadastros ||");
        System.out.println("--------------------------------------------------");
        
        for (int i = (advogado.length-1); i > (advogado.length-4); i--) {
            System.out.println("Nome: "+advogado[i].nome+" || Nº OAB: "+advogado[i].cadastroOab
                    +" || Anos de Atuacao: "+advogado[i].getAnosAtuacao()+" || Especialidade: "+advogado[i].getEspecialidade()
                    +" || Graducao: "+advogado[i].getGraduacao()+" || Valor Hora: "+advogado[i].getValorHora()+" || Salario: "+advogado[i].getSalario());
        }
        
    }
}
