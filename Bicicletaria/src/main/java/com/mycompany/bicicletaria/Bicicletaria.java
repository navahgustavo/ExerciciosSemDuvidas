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
        String cor;
        int ano;
        int marchas;
        int aro;
        double preco;
        
        System.out.println("Bom dia, cadastre as bicicletas: ");
        System.out.println("--------------------------------------------------");
        
        for(int i = 0; i < 1; i++){
            System.out.print("Informe o modelo da bicicleta: ");
            modelo = ler.next();
            
            System.out.print("Informe a marca: ");
            marca = ler.next();
            
            bicicleta[i] = new Bicicleta(modelo, marca);
            
            System.out.print("Informe a cor da bicicleta: ");
            cor = ler.next();
            bicicleta[i].setCor(cor);
            
            System.out.print("Informe o ano da bicicleta: ");             
            ano = ler.nextInt();
            bicicleta[i].setAno(ano);
            
            System.out.print("Informe a quantidade de marchas: ");
            marchas = ler.nextInt();
            bicicleta[i].setMarchas(marchas);
            
            System.out.print("Informe o aro da bicicleta: ");
            aro = ler.nextInt();
            bicicleta[i].setAro(aro);
            
            System.out.print("Informe o valor de venda: ");
            preco = ler.nextDouble();
            bicicleta[i].setPreco(preco);

            System.out.println("--------------------------------------------------");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("|| Bicicletas Cadastradas ||");
        System.out.println("--------------------------------------------------");       
        
        for(int i = 0; i < 1; i++){
            System.out.println("Modelo: "+bicicleta[i].modelo+"\nMarca: "+bicicleta[i].marca);
            System.out.println("Cor: "+bicicleta[i].cor);
            System.out.println("Aro: "+bicicleta[i].getAro()+"\nMarchas: "+bicicleta[i].getMarchas());
            System.out.println("Preço: "+bicicleta[i].getPreco());
            System.out.println("--------------------------------------------------");
        }
    }
}
