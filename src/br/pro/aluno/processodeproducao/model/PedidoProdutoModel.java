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
public class PedidoProdutoModel {

    public int getQantCadaProduto() {
        return qantCadaProduto;
    }

    public void setQantCadaProduto(int qantCadaProduto) {
        this.qantCadaProduto = qantCadaProduto;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
    }
    private int qantCadaProduto;
    private ProdutoModel produto;
    private PedidoModel pedido;

    public PedidoProdutoModel(int qantCadaProduto, ProdutoModel produto, PedidoModel pedido) {
        this.qantCadaProduto = qantCadaProduto;
        this.produto = produto;
        this.pedido = pedido;
    }

    public PedidoProdutoModel() {
        qantCadaProduto = 0;
        produto = new ProdutoModel();
        pedido = new PedidoModel();
    }
    
}
