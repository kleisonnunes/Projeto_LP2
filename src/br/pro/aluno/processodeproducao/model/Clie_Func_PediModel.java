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
public class Clie_Func_PediModel {

    public FuncionarioModel getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioModel funcionario) {
        this.funcionario = funcionario;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
    }
    private FuncionarioModel funcionario;
    private ClienteModel cliente;
    private PedidoModel pedido;

    public Clie_Func_PediModel(FuncionarioModel funcionario, ClienteModel cliente, PedidoModel pedido) {
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public Clie_Func_PediModel() {
        funcionario = new FuncionarioModel();
        cliente = new ClienteModel();
        pedido = new PedidoModel();
    }
}
