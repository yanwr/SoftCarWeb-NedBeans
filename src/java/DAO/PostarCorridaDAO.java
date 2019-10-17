
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.PostarCorrida;

public class PostarCorridaDAO {
    
    Connection com;

    public PostarCorridaDAO() {
         com = connectionDB.getConnection();
    }
    
    public void addCorrida(PostarCorrida pc){
        
           try{
               String sql = "insert into viagem(cod_motorista, cod_empresa, cod_bairro, data_postagem, hora_postagem, data_saida, hora_saida, taxa, assentos)"
                       + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement ps = com.prepareStatement(sql);
               ps.setInt(1, pc.getMotorista());
               ps.setInt(2, pc.getDestino());
               ps.setInt(3, pc.getSaida());
               ps.setString(4, pc.getDataCorrida());
               ps.setString(5, pc.getHoraCorrida());
               ps.setString(6, pc.getDtSaida());
               
           }catch(SQLException e){
               System.out.println(e);
           }
    }
}
