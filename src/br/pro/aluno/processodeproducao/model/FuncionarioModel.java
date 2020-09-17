/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Casa
 */
public class FuncionarioModel extends UsuarioModel{

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    private String cargo;
    private Date dataContratacao;
    private UsuarioModel usuario;

    public FuncionarioModel(String cargo, Date dataContratacao, UsuarioModel usuario) {
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.usuario = usuario;
    }

    public FuncionarioModel() {
        cargo = new String();
        dataContratacao = new Date(new java.util.Date().getTime());
        usuario = new UsuarioModel();
    }
    
}
