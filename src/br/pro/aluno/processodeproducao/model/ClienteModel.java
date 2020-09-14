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
public class ClienteModel extends UsuarioModel{

    public Timestamp getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Timestamp dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getRepresenta() {
        return representa;
    }

    public void setRepresenta(String representa) {
        this.representa = representa;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    private Timestamp dataCadastro;
    private String representa;
    private UsuarioModel usuario;

    public ClienteModel(Timestamp dataCadastro, String representa, UsuarioModel usuario) {
        this.dataCadastro = dataCadastro;
        this.representa = representa;
        this.usuario = usuario;
    }

    public ClienteModel() {
        dataCadastro = new Timestamp(new java.util.Date().getTime());
        representa = new String();
        usuario = new UsuarioModel();
    }
    
}
