/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.LoginDAO;
import DAO.cadastroDAO;
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
public class TesteCadastroLogin {   
    
    Usuario user = new Usuario("nicolas@gmail.com", "coxinha123", "Nicolas Ouriques");
    
    @Test
    public void TesteCadastro() {
        
        cadastroDAO c = new cadastroDAO();
        c.inserirUser(user);
        
        System.out.println("Cadastrado com Sucesso");    
        
    }
    
    @Test
    public void TesteLogin() throws SQLException{

        Usuario logando = new Usuario(user.getEmail(), user.getSenha());
        
        LoginDAO l = new LoginDAO();
        Usuario u = l.logar(logando);

        if(u.isLogado()){
          System.out.println("Logado com sucesso senhor(a) "+u.getNomeUser());     
        }
        
    }
}
