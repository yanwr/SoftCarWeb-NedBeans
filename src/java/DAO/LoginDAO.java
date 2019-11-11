/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class LoginDAO {
    
    Connection con;

    public LoginDAO() {
         con = connectionDB.getConnection();
    }
    
    public Usuario logar(Usuario user) throws SQLException{
    
        String sql = "select*from usuario where email='"+user.getEmail()+"'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        //

        // variaveis para pegar os dados do banco
        String s = null;
        int id = 0;
        String nomeUser = null;
        String profissao = null;
        String tempoTrampo = null;
        String tel = null;
        String fotoPerfil = null;
        boolean entrar = false;
        //

        while(rs.next()){

         id = rs.getInt("cod_user");
         s = rs.getString("senha");
         nomeUser = rs.getString("nome");
         profissao = rs.getString("profissao");
         tempoTrampo = rs.getString("tempo_trabalho");
         tel = rs.getString("numero_cel");
         fotoPerfil = rs.getString("foto_perfil");
         
        }
        Usuario usuario = new Usuario();
                
        if(user.getSenha().equals(s)){
            usuario = new Usuario(id, nomeUser, true, profissao, tempoTrampo, tel, fotoPerfil);
        }else{
            usuario.setLogado(false);
        } 
        
        ps.close();
        con.close();
        
       return usuario;
    }
    
}
