
package testes;

import model.SolicitarCarona;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteClassSolicitar {
    
    private final SolicitarCarona sc = new SolicitarCarona("Paulo", "Vargem", "SoftPlan", "local.pdf", "2000-09-09", "23:33", "2000-09-09", "23:40", 3, (float) 12.50);
    
    @Test
    public void TesteClassSolicitar() {
        
        // testando o primeiro user
        System.out.println(sc.toString());
        //
        
        // testando Sets e Gets
            
            String nvMotora = "Paulo Batistella";
            String nvDestino = "Escritorio";
            String nvSaida = "Canas";
            String nvFtPerfil = "segundo.pdg";
            String nvDtPost = "2019-12-12";
            String nvHrPost = "22:22";
            String nvDtSaida = "2019-03-23";
            String nvHrSaida = "20:30";
            int nvAssento = 2;
            float nvTaxa = (float) 2.55;
            
            sc.setMotorista(nvMotora);
            sc.setDestino(nvDestino);
            sc.setSaida(nvSaida);
            sc.setDataPostagem(nvDtPost);
            sc.setHoraPostagem(nvHrPost);
            sc.setFtPerfil(nvFtPerfil);
            sc.setDataSaida(nvDtSaida);
            sc.setHoraSaida(nvHrSaida);
            sc.setAssentos(nvAssento);
            sc.setTaxa(nvTaxa);
            
            System.out.println("SolicitarCarona novo: "+"motorista = "+sc.getMotorista()+", "+"destino = "+sc.getDestino()+", "+"saida = "+sc.getSaida()+", "+" FtPerfil = "+sc.getFtPerfil()+", "
            +"dataPostagem = "+sc.getDataPostagem()+", "+"horaPostagem = "+sc.getHoraPostagem()+", "+"dataSaida = "+sc.getDataSaida()+", "+"horaSaida = "+sc.getHoraSaida()+", "+"assentos = "+sc.getAssentos()+", "+"taxa = "+sc.getTaxa());
        //
    }
    
}
