/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.LoginDAO;
import DAO.OferecerCorridaDAO;
import java.sql.SQLException;
import model.OferecerCorrida;
import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TesteOferecerCarona {
    
    Usuario user = new Usuario("nicolas@gmail.com", "coxinha123", "Nicolas Ouriques");
    
    @Test
    public void TesteOferecerCarona() throws SQLException {
        
        Usuario logando = new Usuario(user.getEmail(), user.getSenha());
        
        LoginDAO l = new LoginDAO();
        Usuario u = l.logar(logando);
        
        OferecerCorrida corrida = new OferecerCorrida(u.getId(),"2019-10-24","17:30","18:00","2019-10-24",
                44, 1, 2, (float) 2.90);
        
        OferecerCorridaDAO ocd = new OferecerCorridaDAO();
        
        ocd.addCorrida(corrida);
        
        
    }
    
}
