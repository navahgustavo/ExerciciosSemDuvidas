package com.mycompany.cadastrarpacientes;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class Consultorio {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Paciente[] paciente = new Paciente[6];
        
        String nome;
        int idade;
        double peso;
        int altura;
        Sintoma sintoma = null;
        char emergencial;
        
        System.out.println("Bom dia, cadastre os jogadores para o campeonato: ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.print("Cadastro "+(i+1)+"/6");
            System.out.print("Informe o nome do Paciente: ");
            nome = ler.next();
            System.out.print("Informe a idade do Paciente: ");
            idade = ler.nextInt();
            System.out.print("Informe o peso do Paciente (ex 65.8): ");
            peso = ler.nextDouble();
            System.out.print("Informe a altura do Paciente (em cm): ");
            altura = ler.nextInt();
            System.out.print("Informe o Sintoma: ");
            sintoma.nome = ler.next();
            System.out.print("Informe a Gravidade (L = leve, M = moderado, G = grave, X = gravissimo): ");
            sintoma.gravidade = ler.next().charAt(0);
            sintoma.gravidade = Character.toUpperCase(sintoma.gravidade);
            System.out.print("Emergencial (S/N): ");
            emergencial = ler.next().charAt(0);
            emergencial = Character.toUpperCase(emergencial);
            if (emergencial == 'S') {
                sintoma.emergencial = true;
            } else {
                sintoma.emergencial = false;
            }
            System.out.print("Quantas vezes por dia o paciente tem os sintomas: ");
            sintoma.fequencia = ler.nextInt();
            paciente[i] = new Paciente(nome, idade, peso, altura, sintoma);
        }
        
    }
}
