package com.mycompany.bicicletaria;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Bicicletaria {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Bicicleta[] bicicleta = new Bicicleta[4];
        
        String modelo;
        String marca;
        int aro;
        int marchas;
        double precoCusto;
        double precoVenda;
        
        System.out.println("Bom dia, cadastre as bicicletas: ");
        System.out.println("--------------------------------------------------");
        for(int i = 0; i < 2; i++){
            System.out.print("Informe o modelo da bicicleta: ");
            modelo = ler.next();
            System.out.print("Informe a marca: ");
            marca = ler.next();
            System.out.println("Informe o aro da bicicleta conforme a tabela: ");
            System.out.println("1 - ARO 12");
            System.out.println("2 - ARO 16");
            System.out.println("3 - ARO 20");
            System.out.println("4 - ARO 24");
            System.out.println("5 - ARO 26");
            aro = ler.nextInt();
            System.out.print("Informe a cor da bicicleta: ");
            String cor = ler.next();
            System.out.println("Informe a quantidade de marchas conforme a tabela: ");
            System.out.println("1 - 18 marchas");
            System.out.println("2 - 21 marchas");
            System.out.println("3 - 24 marchas");
            System.out.println("4 - 27 marchas");
            System.out.println("5 - 30 marchas");
            marchas = ler.nextInt();
            System.out.print("Informe o valor de custo: ");
            precoCusto = ler.nextDouble();
            System.out.print("Informe o valor de venda: ");
            precoVenda = ler.nextDouble();
            bicicleta[i] = new Bicicleta(modelo, marca, aro, cor, marchas, precoCusto, precoVenda);
            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("|| Bicicletas Cadastradas ||");
        System.out.println("--------------------------------------------------");       
        for(int i = 0; i < 2; i++){
            System.out.println("Modelo: "+bicicleta[i].getModelo()+"\tMarca: "+bicicleta[i].getMarca()+"\tCor: "+bicicleta[i].getCor());
            System.out.print("Aro: ");
            bicicleta[i].tamanhoAro();
            System.out.print("Marchas: ");
            bicicleta[i].numeroMarchas();
            System.out.println("Custo: "+bicicleta[i].getPrecoCusto()+"\tPreço: "+bicicleta[i].getPrecoVenda());
            System.out.println("--------------------------------------------------");
        }
    }
}
