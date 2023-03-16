package com.mycompany.pedidomesadebar;

import java.util.Scanner;

/**
 *
 * @author Gustavo H. Nava
 */
public class PedidoMesaDeBar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Pedido[] pedido = new Pedido[5];
        
        int numPedido;
        String nomeCliente;
        int quantidadeItens;
        double valorItens;       
        double valor;
        double valorTotalPedidos = 0;
        
        System.out.println("Bom dia, informe os pedidos: ");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            numPedido = i+1;
            System.out.println("Pedido nº"+numPedido);
            System.out.print("Informe o nome do cliente: ");
            nomeCliente = ler.next();
            System.out.print("Informe a quantidade de itens: ");
            quantidadeItens = ler.nextInt();
            System.out.print("Informe o valor de cada item: ");
            valorItens = ler.nextDouble();
            valor = quantidadeItens*valorItens;
            System.out.printf("Valor do pedido = R$ %.2f",valor);
            System.out.println("");
            System.out.println("--------------------------------------------------");
            valorTotalPedidos+= valor;
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Valor total dos pedidos: R$ %.2f",valorTotalPedidos);
        
    }
}
