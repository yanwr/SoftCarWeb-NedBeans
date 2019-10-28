
package testes;

import model.OferecerCorrida;
import org.junit.Test;
import static org.junit.Assert.*;


public class TesteClassOferecer {
    
   private final OferecerCorrida of = new OferecerCorrida(2, "2000-09-09", "12:20", "13:40", "2000-09-10", 2, 3, 2, (float) 33.33);
    
    @Test
    public void TesteClassOferecer() {
        
        // testando o primeiro user
        System.out.println(of.toString());
        //
        
        // testando Sets e Gets
            
            int nvCod = 4;
            String nvDataPost = "9999-12-12";
            String nvHoraPost = "11:23";
            String nvDataSaida = "2222-09-31";
            String nvHoraSaida = "2019-02-09";
            int nvDest = 44; 
            int nvSaid = 1;
            int nvAssent = 1;
            float nvTaxa = (float) 12.56;
            
            of.setMotorista(nvCod);
            of.setDataCorrida(nvDataPost);
            of.setHoraCorrida(nvHoraPost);
            of.setHrSaida(nvHoraSaida);
            of.setDtSaida(nvDataSaida);
            of.setDestino(nvDest);
            of.setSaida(nvSaid);
            of.setAssentos(nvAssent);
            of.setTaxa(nvTaxa);
            
            System.out.println("OfecerCorrida novo: "+"motorista = "+of.getMotorista()+", "+"dataCorrida = "+of.getDataCorrida()+", "+"horaCorrida = "+of.getHoraCorrida()+", "+"horaSaida = "+of.getHrSaida()+", "
            +"dataSaida = "+of.getDtSaida()+", "+"destino = "+of.getDestino()+", "+"saida = "+of.getSaida()+", "+"assentos = "+of.getAssentos()+", "+"taxa = "+of.getTaxa());
        //
        
    }
    
}
