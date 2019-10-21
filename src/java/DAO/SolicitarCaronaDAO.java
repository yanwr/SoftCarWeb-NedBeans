
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.SolicitarCarona;

public class SolicitarCaronaDAO {
    
   Connection con;
   private SolicitarCarona sc = new SolicitarCarona();
   private SolicitarCarona sc2 = new SolicitarCarona();
   
   public SolicitarCaronaDAO(){
       con = connectionDB.getConnection();
   }
   // para ter sempre todas as caronas amostrar sem procurar nenhuma especifica 
    public SolicitarCarona pegarTodasCaronas(){
        try{
            String sql = "select cod_motorista, destino, saida, data_postagem, hora_postagem, data_saida, "
                    + "hora_saida, assentos, taxa from viagem";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            // obj das caronas 
             
            //
            while(rs.next()){
                
                sc2.setMotorista(rs.getInt("cod_motorista"));
                sc2.setDestino(rs.getInt("destino"));
                sc2.setSaida(rs.getInt("saida"));
                sc2.setDataPostagem(rs.getString("data_postagem"));
                sc2.setHoraPostagem(rs.getString("hora_postagem"));
                sc2.setDataSaida(rs.getString("data_saida"));
                sc2.setHoraSaida(rs.getString("hora_saida"));
                sc2.setAssentos(rs.getInt("assentos"));
                sc2.setTaxa(rs.getFloat("taxa"));            
            }
            
            ps.close();
            rs.close();
            con.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return sc2;
   }
   //
   
   // para pegar as carona especificas da procura
    public SolicitarCarona pegarTodasCaronasEspecificas(int destino, int saida){
       
        try{
            String sql = "select cod_motorista, destino, saida, data_postagem, hora_postagem, data_saida, "
                    + "hora_saida, assentos, taxa from viagem where destino = '"+destino+"' and saida = '"+saida+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            // obj das caronas 
             
            //
            while(rs.next()){
                
                sc.setMotorista(rs.getInt("cod_motorista"));
                sc.setDestino(rs.getInt("destino"));
                sc.setSaida(rs.getInt("saida"));
                sc.setDataPostagem(rs.getString("data_postagem"));
                sc.setHoraPostagem(rs.getString("hora_postagem"));
                sc.setDataSaida(rs.getString("data_saida"));
                sc.setHoraSaida(rs.getString("hora_saida"));
                sc.setAssentos(rs.getInt("assentos"));
                sc.setTaxa(rs.getFloat("taxa"));            
            }
            
            ps.close();
            rs.close();
            con.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
       return sc;
    }
   //
}
