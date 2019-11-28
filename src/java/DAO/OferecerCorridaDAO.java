
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.OferecerCorrida;

public class OferecerCorridaDAO {
    
    Connection com;

    public OferecerCorridaDAO() {
         com = connectionDB.getConnection();
    }
    
    public void addCorrida(OferecerCorrida pc){
        
           try{
               String sql = "insert into viagem(cod_motorista, destino, saida, data_postagem, hora_postagem, data_saida, hora_saida, taxa, assentos)"
                       + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement ps = com.prepareStatement(sql);
               ps.setInt(1, pc.getMotorista());
               ps.setInt(2, pc.getDestino());
               ps.setInt(3, pc.getSaida());
               ps.setString(4, pc.getDataCorrida());
               ps.setString(5, pc.getHoraCorrida());
               ps.setString(6, pc.getDtSaida());
               ps.setString(7, pc.getHrSaida());
               ps.setFloat(8, pc.getTaxa());
               ps.setInt(9, pc.getAssentos());
               
               ps.executeUpdate();
               ps.close();
               com.close();
               
           }catch(SQLException e){
               System.out.println(e);
           }
    }
//    public void menosBanco(int codUser){
//        
//           try{
//               String sql = "insert into viagem(cod_motorista, destino, saida, data_postagem, hora_postagem, data_saida, hora_saida, taxa, assentos)"
//                       + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
//               PreparedStatement ps = com.prepareStatement(sql);
//               ps.setInt(1, pc.getMotorista());
//               ps.setInt(2, pc.getDestino());
//               ps.setInt(3, pc.getSaida());
//               ps.setString(4, pc.getDataCorrida());
//               ps.setString(5, pc.getHoraCorrida());
//               ps.setString(6, pc.getDtSaida());
//               ps.setString(7, pc.getHrSaida());
//               ps.setFloat(8, pc.getTaxa());
//               ps.setInt(9, pc.getAssentos());
//               
//               ps.executeUpdate();
//               ps.close();
//               com.close();
//               
//           }catch(SQLException e){
//               System.out.println(e);
//           }
//    }
}
