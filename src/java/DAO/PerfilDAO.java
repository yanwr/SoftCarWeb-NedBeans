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
public class PerfilDAO {
    Connection con;

    public PerfilDAO() {
         con = connectionDB.getConnection();
    
    }
    //Atualizar os dados da session
    public Usuario getDadosAtualizados(Usuario user) throws SQLException{
    
        String sql = "select*from usuario where cod_user='"+user.getId()+"'";
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
        
        Usuario usuario = new Usuario(id, nomeUser, profissao, tempoTrampo, tel, fotoPerfil);
        
        ps.close();
        con.close();
        
        return usuario;
    }
    
    public void setPerfilDados(Usuario user){
        try {
            
            String sql = "update usuario set profissao ='"+user.getProfissao()+"', tempo_trabalho ='"+user.getTempoTrampo()+"'"
                    + ", numero_cel ='"+user.getTelefone()+"', foto_perfil ='"+user.getFotoPerfil()+"'"
                    + " where cod_user = '"+user.getId()+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.executeUpdate();
//            ps.close();
//            con.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}


