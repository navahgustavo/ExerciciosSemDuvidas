package com.mycompany.bicicletaria;

/**
 *
 * @author Gustavo
 */
public class Bicicleta {
    
    public String modelo;
    public String marca;
    public String cor;
    private int ano;
    private int marchas;
    private int aro;
    private double preco;     

    public Bicicleta(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
