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
public class PecaModel {

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public String getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(String idPeca) {
        this.idPeca = idPeca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public MatPrimaModel getMatPrima() {
        return matPrima;
    }

    public void setMatPrima(MatPrimaModel matPrima) {
        this.matPrima = matPrima;
    }
    private String nomePeca;
    private int quantEstoque;
    private String idPeca;
    private double altura;
    private double largura;
    private double comprimento;
    private MatPrimaModel matPrima;

    public PecaModel(String nomePeca, int quantEstoque, String idPeca, double altura, double largura, double comprimento, MatPrimaModel matPrima) {
        this.nomePeca = nomePeca;
        this.quantEstoque = quantEstoque;
        this.idPeca = idPeca;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.matPrima = matPrima;
    }

    public PecaModel() {
        nomePeca = new String();
        quantEstoque = 0;
        idPeca = new String();
        altura = 0;
        largura = 0;
        comprimento = 0;
        matPrima = new MatPrimaModel();
    }  
}
