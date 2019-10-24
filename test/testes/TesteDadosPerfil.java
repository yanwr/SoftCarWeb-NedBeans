/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.LoginDAO;
import DAO.PerfilDAO;
import java.sql.SQLException;
import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TesteDadosPerfil {
    
    Usuario user = new Usuario("nicolas@gmail.com", "coxinha123", "Nicolas Ouriques");
    
    @Test
    public void TesteDadosPerfil() throws SQLException {
        
        Usuario logando = new Usuario(user.getEmail(), user.getSenha());
        
        LoginDAO l = new LoginDAO();
        Usuario userP = l.logar(logando);
        
        PerfilDAO p = new PerfilDAO();
        p.setPerfilDados(userP);
        
        userP = p.getDadosAtualizados(userP);
        
        System.out.println(userP.toString());  
        
    }
    
}
