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
public class TesteCadastro {   
    
    Usuario user = new Usuario("teste@gmail.com", "123345", "Paulo Testando");
    
    @Test
    public void TesteCadastro() {
        
        cadastroDAO c = new cadastroDAO();
        boolean e = c.inserirUser(user);
        if(e)
            System.out.println("Sucesso !");
        else
            System.out.println("Erro !");
        
    }

}
