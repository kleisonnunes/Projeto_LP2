/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.data;

import br.pro.aluno.processodeproducao.model.ClienteModel;
import br.pro.aluno.processodeproducao.model.ProdutoModel;
import br.pro.aluno.processodeproducao.model.UsuarioModel;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author João
 */
public class ClienteData extends Conexao{
     public ClienteData() throws Exception{}
    public boolean incluir(ClienteModel obj) throws Exception{      
        String sql="INSERT INTO cliente (datacadastro, representa) "
                + "values (?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setDate(1, (Date) obj.getDataCadastro());
        ps.setString(2, obj.getRepresenta());
        
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(ClienteModel obj) throws Exception{
        String sql = "UPDATE cliente SET dataCadastro = ?, representa = ? WHERE cpf_cli = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setTimestamp(1, (Timestamp) obj.getDataCadastro());
        ps.setString(2, obj.getRepresenta());
           
        return ps.executeUpdate() > 0;
    }
    
    public boolean excluir(int idProd) throws Exception{
        String sql = "DELETE FROM cliente WHERE cpf_cli = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idProd);
        return ps.executeUpdate() > 0;
    }
    
     public ArrayList<UsuarioModel> pesquisar(String texto) throws Exception{
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql = "SELECT * FROM usuario WHERE ";
        for(int i = 0; i < palavras.length; i++){
            if(i > 0 && i != palavras.length) 
            sql+="or ";
            sql +="nome ILIKE '%"+palavras[i]+"%' ";         

        }

        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            UsuarioModel obj = new UsuarioModel(rs.getInt("cep"),
            rs.getString("cidade"),
            rs.getInt("nro"),
            rs.getString("rua"),
            rs.getString("cpf"),
            rs.getString("senha"),
            rs.getString("nome"),
            rs.getString("email"));
        dados.add(obj);
        }
        return dados;
    }
}
