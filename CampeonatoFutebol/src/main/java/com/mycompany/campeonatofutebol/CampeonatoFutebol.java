package com.mycompany.campeonatofutebol;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class CampeonatoFutebol {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Jogador[] jogador = new Jogador[5];
        TimeFutebol[] time = new TimeFutebol[2];
        
        String nomeJogador;
        int idadeJogador;
        String posicaoJogador;
        int numeroJogador;
        double salarioJogador;
        
        String nomeTime;
        String cidadeTime;
        String siglaTime;
        int colocacaoTime;
        Jogador capitaoTime = null;
        
        System.out.println("Bom dia, cadastre os jogadores para o campeonato: ");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro "+(i+1)+"/5");
            System.out.print("Informe o nome do Jogador: ");
            nomeJogador = ler.next();
            System.out.print("Informe a idade do Jogador: ");
            idadeJogador = ler.nextInt();
            System.out.print("Informe a posição do Jogador: ");
            posicaoJogador = ler.next();
            System.out.print("Informe o número do Jogador: ");            
            numeroJogador = ler.nextInt();
            System.out.print("Informe o salário do Jogador: ");
            salarioJogador = ler.nextDouble();
            jogador[i] = new Jogador(nomeJogador, idadeJogador, posicaoJogador, numeroJogador, salarioJogador);
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("Cadastro de Jogadores concluído.");
        System.out.println("--------------------------------------------------");
        System.out.println("Agora cadastre os times: ");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Cadastro "+(i+1)+"/2");
            System.out.print("Informe o nome do Time: ");
            nomeTime = ler.next();
            System.out.print("Informe a cidade do Time: ");
            cidadeTime = ler.next();
            System.out.print("Informe a sigla do Time: ");
            siglaTime = ler.next();
            System.out.print("Informe a colocacao do Time: ");
            colocacaoTime = ler.nextInt();
            boolean correto = false;
            while (correto == false) {                
                System.out.print("Informe jogador capitao do Time: ");
                nomeJogador = ler.next();
                for (int j = 0; j < 5; j++) {
                    if(nomeJogador.equals(jogador[j].getNome())){
                        capitaoTime = jogador[j];
                        correto = true;
                    }
                }
            }
            time[i] = new TimeFutebol(nomeTime, cidadeTime, siglaTime, colocacaoTime, capitaoTime);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("|| Jogo do Dia ||");
        System.out.println(" O jogo de hoje é "+time[0].getNomeTime()+" vs "+time[1].getNomeTime());
        System.out.println("--------------------------------------------------");
        System.out.println(time[0].getNomeTime());
        System.out.println("Cidade:\t"+time[0].getCidade());
        System.out.println("Sigla:\t"+time[0].getSigla());
        System.out.println("Colocacao:\t"+time[0].getColocacao());
        System.out.println("Capitao:\t"+time[0].getCapitao().getNome());
        System.out.println("--------------------------------------------------");
        System.out.println(time[1].getNomeTime());
        System.out.println("Cidade:\t"+time[1].getCidade());
        System.out.println("Sigla:\t"+time[1].getSigla());
        System.out.println("Colocacao:\t"+time[1].getColocacao());
        System.out.println("Capitao:\t"+time[1].getCapitao().getNome());
        
    }
}
