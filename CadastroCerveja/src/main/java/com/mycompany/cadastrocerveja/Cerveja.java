package com.mycompany.cadastrocerveja;

/**
 *
 * @author Gustavo H. Nava
 */
public class Cerveja {
    
    public String nome;
    public String marca;
    public String tipo;
    public int mililitros;
    private static int codigo = 0;
    private double preco;

    public Cerveja(String nome, String marca, String tipo, int mililitros, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.mililitros = mililitros;
        this.preco = preco;
        codigo++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
