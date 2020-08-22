/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

import java.sql.Timestamp;

/**
 *
 * @author Casa
 */
public class PedidoModel {

    public Timestamp getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Timestamp dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    private Timestamp dataPedido;
    private String idPedido;

    public PedidoModel(Timestamp dataPedido, String idPedido) {
        this.dataPedido = dataPedido;
        this.idPedido = idPedido;
    }

    public PedidoModel() {
        dataPedido = new Timestamp(new java.util.Date().getTime());
        idPedido = new String();
    }
    
}
