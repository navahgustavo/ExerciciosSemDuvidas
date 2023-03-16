package com.mycompany.pedidomesadebar;

/**
 *
 * @author aluno
 */
public class Pedido {
    
    private int numPedido;
    private String nomeCliente;
    private int quantidadeItens;
    private double valorItens;       
    private double valor;

    public Pedido(int numPedido, String nomeCliente, int quantidadeItens, double valorItens, double valor) {
        this.numPedido = numPedido;
        this.nomeCliente = nomeCliente;
        this.quantidadeItens = quantidadeItens;
        this.valorItens = valorItens;
        this.valor = valor;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public double getValorItens() {
        return valorItens;
    }

    public void setValorItens(double valorItens) {
        this.valorItens = valorItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
