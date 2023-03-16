package com.mycompany.bicicletaria;

/**
 *
 * @author Gustavo
 */
public class Bicicleta {
    public String modelo;
    public String marca;
    public int aro;
    private String cor;
    private int marcha;
    private double precoCusto;
    private double precoVenda;     

    public Bicicleta(String modelo, String marca, int aro, String cor, int marcha, double precoCusto, double precoVenda) {
        this.modelo = modelo;
        this.marca = marca;
        this.aro = aro;
        this.cor = cor;
        this.marcha = marcha;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public void tamanhoAro(){
        switch (aro) {
            case 1 -> System.out.println("12");
            case 2 -> System.out.println("16");
            case 3 -> System.out.println("20");
            case 4 -> System.out.println("24");
            case 5 -> System.out.println("26");
            default -> System.out.println("X");
        }
    }
        
    public void numeroMarchas(){
        switch (marcha) {
            case 1 -> System.out.println("18");
            case 2 -> System.out.println("21");
            case 3 -> System.out.println("24");
            case 4 -> System.out.println("27");
            case 5 -> System.out.println("30");
            default -> {
            }
        }
    }             
}
