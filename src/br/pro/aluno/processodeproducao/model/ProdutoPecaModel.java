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
public class ProdutoPecaModel {

    public int getQantCadaPeca() {
        return qantCadaPeca;
    }

    public void setQantCadaPeca(int qantCadaPeca) {
        this.qantCadaPeca = qantCadaPeca;
    }

    public PecaModel getPeca() {
        return peca;
    }

    public void setPeca(PecaModel peca) {
        this.peca = peca;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }
    private int qantCadaPeca;
    private PecaModel peca;
    private ProdutoModel produto;

    public ProdutoPecaModel(int qantCadaPeca, PecaModel peca, ProdutoModel produto) {
        this.qantCadaPeca = qantCadaPeca;
        this.peca = peca;
        this.produto = produto;
    }

    public ProdutoPecaModel() {
        qantCadaPeca = 0;
        peca = new PecaModel();
        produto = new ProdutoModel();
    }
}
