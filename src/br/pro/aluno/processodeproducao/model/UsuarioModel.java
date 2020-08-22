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
public class UsuarioModel {

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public char getUf() {
        return uf;
    }

    public void setUf(char uf) {
        this.uf = uf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    private int cep;
    private String cidade;
    private int nro;
    private String rua;
    private char uf;
    private String cpf;
    private String senha;
    private String nome;
    private int nivel;

    public UsuarioModel(int cep, String cidade, int nro, String rua, char uf, String cpf, String senha, String nome, int nivel) {
        this.cep = cep;
        this.cidade = cidade;
        this.nro = nro;
        this.rua = rua;
        this.uf = uf;
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
        this.nivel = nivel;
    }

    public UsuarioModel() {
        cep = 0;
        cidade = new String();
        nro = 0;
        rua = new String();
        uf = 0;
        cpf = new String();
        senha = new String();
        nome = new String();
        nivel = 0;
    }
}
