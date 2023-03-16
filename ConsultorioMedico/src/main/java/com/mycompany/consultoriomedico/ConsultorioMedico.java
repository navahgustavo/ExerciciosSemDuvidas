package com.mycompany.consultoriomedico;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ConsultorioMedico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Paciente[] paciente = new Paciente[6];
        
        String nome;
        int idade;
        double peso;
        int altura;
        char emergencial;
        
        System.out.println("Bom dia, cadastre os jogadores para o campeonato: ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.println("Cadastro "+(i+1)+"/6");
            System.out.print("Informe o nome do Paciente: ");
            nome = ler.next();
            System.out.print("Informe a idade do Paciente: ");
            idade = ler.nextInt();
            System.out.print("Informe o peso do Paciente (ex 65.8): ");
            peso = ler.nextDouble();
            System.out.print("Informe a altura do Paciente (em cm): ");
            altura = ler.nextInt();
            System.out.print("Informe o Sintoma: ");
            String sintomaNome = ler.next();
            System.out.print("Informe a Gravidade (L = leve, M = moderado, G = grave, X = gravissimo): ");
            char sintomaGravidade = ler.next().charAt(0);
            sintomaGravidade = Character.toUpperCase(sintomaGravidade);
            System.out.print("Emergencial (S/N): ");
            emergencial = ler.next().charAt(0);
            emergencial = Character.toUpperCase(emergencial);
            boolean sintomaEmergencial = true;
            if (emergencial == 'N') {
                sintomaEmergencial = false;
            }
            System.out.print("Quantas vezes por dia o paciente tem os sintomas: ");
            int sintomaFequencia = ler.nextInt();
            Sintoma sintoma = new Sintoma(sintomaNome, sintomaGravidade, sintomaEmergencial, sintomaFequencia);
            paciente[i] = new Paciente(nome, idade, peso, altura, sintoma);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("|| Pacientes ||");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.println("Nome: "+paciente[i].getNome());
            System.out.println("Altura: "+paciente[i].getAltura()+"cm");
            System.out.println("Peso: "+paciente[i].getPeso()+"kg");
            System.out.println("Sintoma: "+paciente[i].getSintoma().nome);
            System.out.println("Gravidade: "+paciente[i].getSintoma().gravidade);
            System.out.println("Frequencia: "+paciente[i].getSintoma().fequencia+" vezez por dia");
            if (paciente[i].getSintoma().emergencial == true) {
                System.out.println("EMERGENCIAL");
            } else {
                System.out.println("NÃO EMERGENCIAL");
            }
        }
        
    }
}
