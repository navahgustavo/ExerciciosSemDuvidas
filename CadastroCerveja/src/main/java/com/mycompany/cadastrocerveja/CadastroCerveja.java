package com.mycompany.cadastrocerveja;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class CadastroCerveja {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Cerveja[] cerveja = new Cerveja[5];
        
        String nome;
        String marca;
        String tipo;
        int mililitros;
        double preco;
        
        System.out.println("Bom dia, cadastre as cervejas desejadas: ");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro "+(i+1)+"/5");
            System.out.print("Informe o nome da Cerveja: ");
            nome = ler.next();
            System.out.print("Informe a marca da Cerveja: ");
            marca = ler.next();
            System.out.print("Informe o tipo da Cerveja: ");
            tipo = ler.next();
            System.out.print("Informe os MLs: ");            
            mililitros = ler.nextInt();
            System.out.print("Informe o preço da Cerveja: ");
            preco = ler.nextDouble();
            cerveja[i] = new Cerveja(nome, marca, tipo, mililitros, preco);
            System.out.println("--------------------------------------------------");
        }
        System.out.println("");
        System.out.println("|| Cervejas cadastradas: "+cerveja[0].getCodigo()+" ||");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"ª Cerveja");
            System.out.println("Nome: "+cerveja[i].nome);
            System.out.println("Marca: "+cerveja[i].marca);
            System.out.println("Tipo: "+cerveja[i].tipo);
            System.out.println("MLs: "+cerveja[i].mililitros);
            System.out.println("");
            System.out.printf("Preço: R$ %.2f",cerveja[i].getPreco());
        }
    }
}
