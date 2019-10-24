/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.LoginDAO;
import DAO.PerfilDAO;
import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TesteAtualizarPerfil {
    
    Usuario user = new Usuario("nicolas@gmail.com", "coxinha123", "Nicolas Ouriques");
    
    @Test
    public void TesteAtualizarPerfil() throws SQLException {
        
        Usuario logando = new Usuario(user.getEmail(), user.getSenha());
        
        LoginDAO l = new LoginDAO();
        Usuario userP = l.logar(logando);
        
        userP.setProfissao("Programador");
        userP.setTelefone("8-8888-8888");
        userP.setFotoPerfil("fotoPerfil");
        userP.setTempoTrampo("2009-09-09");
        userP.setNomeUser("João Victor Dutra");
        
        PerfilDAO p = new PerfilDAO();
        p.setDados(userP);
        
        userP = p.getDados(userP);
        
        System.out.println(userP.toString());  
        
    }
    
}
