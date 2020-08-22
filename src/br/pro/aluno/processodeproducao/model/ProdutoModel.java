/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

/**
 *
 * @author Casa
 */
public class ProdutoModel {

    public double getValorProd() {
        return valorProd;
    }

    public void setValorProd(double valorProd) {
        this.valorProd = valorProd;
    }

    public double getTempFabric() {
        return tempFabric;
    }

    public void setTempFabric(double tempFabric) {
        this.tempFabric = tempFabric;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
    private double valorProd;
    private double tempFabric;
    private String nomeProd;
    private String idProd;
    private double altura;
    private double comprimento;
    private double largura;
    private int quantEstoque;

    public ProdutoModel(double valorProd, double tempFabric, String nomeProd, String idProd, double altura, double comprimento, double largura, int quantEstoque) {
        this.valorProd = valorProd;
        this.tempFabric = tempFabric;
        this.nomeProd = nomeProd;
        this.idProd = idProd;
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
        this.quantEstoque = quantEstoque;
    }

    public ProdutoModel() {
        valorProd = 0;
        tempFabric = 0;
        nomeProd = new String();
        idProd = new String();
        altura = 0;
        comprimento = 0;
        largura = 0;
        quantEstoque = 0;
    }
}
