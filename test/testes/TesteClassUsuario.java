
package testes;

import model.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteClassUsuario {
    
    private final Usuario user = new Usuario(1,"Yan W.R", "Programador", "2002-02-12", "(48) 9.96893322", "local.pdf");
    
    @Test
    public void TesteClassUsuario() {
        
        // testando o primeiro user
        System.out.println(user.toString());
        //
        
        // testando Sets e Gets
            int novoCod = 2;
            String novoNome = "Yan Weschenfelder Rodrigues";
            String novoTrampo = "Testador";
            String novoTempo = "2010-08-23";
            String novoTel = "(48) 9.99999999";
            String novoFt = "localDois.pdf";
            
            user.setId(novoCod);
            user.setNomeUser(novoNome);
            user.setProfissao(novoTrampo);
            user.setTempoTrampo(novoTempo);
            user.setTelefone(novoTel);
            user.setFotoPerfil(novoFt);
            
            System.out.println("User com novos dados: "+"id = "+user.getId()+", "+"Nome = "+user.getNomeUser()+", "+"Profissao = "+user.getProfissao()+", "+"tempoTrampo = "+user.getTempoTrampo()+", "
            +"Telefone = "+user.getTelefone()+", "+"FtPerfil = "+user.getFotoPerfil());
        //
        
    }
    
}
