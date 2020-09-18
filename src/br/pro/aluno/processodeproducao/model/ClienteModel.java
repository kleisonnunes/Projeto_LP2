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
public class ClienteModel extends UsuarioModel{

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
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
    private String dataCadastro;
    private String representa;
    private UsuarioModel usuario;

    public ClienteModel(String dataCadastro, String representa, UsuarioModel usuario) {
        this.dataCadastro = dataCadastro;
        this.representa = representa;
        this.usuario = usuario;
    }

    public ClienteModel() {
        dataCadastro = new String();
        representa = new String();
        usuario = new UsuarioModel();
    }
    
}
