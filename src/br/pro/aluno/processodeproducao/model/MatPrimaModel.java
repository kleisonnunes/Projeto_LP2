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
public class MatPrimaModel {

    public String getIdMatPrima() {
        return idMatPrima;
    }

    public void setIdMatPrima(String idMatPrima) {
        this.idMatPrima = idMatPrima;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    private String idMatPrima;
    private int quantidade;
    private String descricao;
    private double altura;
    private double largura;
    private double comprimento;

    public MatPrimaModel(String idMatPrima, int quantidade, String descricao, double altura, double largura, double comprimento) {
        this.idMatPrima = idMatPrima;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public MatPrimaModel() {
        idMatPrima = new String();
        quantidade = 0;
        descricao = new String();
        altura = 0;
        largura = 0;
        comprimento = 0;
    }   
}
