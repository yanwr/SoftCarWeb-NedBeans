/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import DAO.SolicitarCaronaDAO;
import java.util.List;
import model.SolicitarCarona;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class TesteCaronasMural {
    
    @Test
    public void TesteCaronasMural() {
        
        SolicitarCaronaDAO scp = new SolicitarCaronaDAO();
        List<SolicitarCarona> listaCaronas = scp.pegarTodasCaronas();
        
        
        System.out.println(listaCaronas.toString());
    }
    
}
