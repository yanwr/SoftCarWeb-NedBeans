
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
    
   public SolicitarCaronaDAO(){
       con = connectionDB.getConnection();
   }
   // para ter sempre todas as caronas amostrar sem procurar nenhuma especifica 
    public SolicitarCarona pegarTodasCaronas(){
        try{
            String sql = "select u.nome as cod_motorista, s.foto_perfil as ft_Perfil, ld.nome as destino, ls.nome as saida,"
                    + " v.data_postagem, v.hora_postagem, v.data_saida, v.hora_saida, v.assentos, v.taxa from viagem v "
                    + "INNER JOIN usuario u ON u.cod_user = v.cod_motorista INNER JOIN local ld ON ld.cod_local = v.destino "
                    + "INNER JOIN local ls ON ls.cod_local = v.saida INNER JOIN usuario s ON s.cod_user = v.cod_motorista;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
           
            while(rs.next()){
                
                sc.setMotorista(rs.getString("cod_motorista"));
                sc.setDestino(rs.getString("destino"));
                sc.setSaida(rs.getString("saida"));
                sc.setFtPerfil(rs.getString("ft_Perfil"));
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
  
   
   // para pegar as carona especificas da procura
    public SolicitarCarona pegarTodasCaronasEspecificas(int destino, int saida){
       
        try{
            String sql = "select u.nome as cod_motorista, s.foto_perfil as ft_Perfil, ld.nome as destino, ls.nome as saida,"
                    + " v.data_postagem, v.hora_postagem, v.data_saida, v.hora_saida, v.assentos, v.taxa from viagem v "
                    + "INNER JOIN usuario u ON u.cod_user = v.cod_motorista INNER JOIN local ld ON ld.cod_local = v.destino "
                    + "INNER JOIN local ls ON ls.cod_local = v.saida INNER JOIN usuario s ON s.cod_user = v.cod_motorista"
                    + " where destino = '"+destino+"' and saida = '"+saida+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            // obj das caronas 
             
            //
            while(rs.next()){
                
                sc.setMotorista(rs.getString("cod_motorista"));
                sc.setDestino(rs.getString("destino"));
                sc.setSaida(rs.getString("saida"));
                sc.setFtPerfil(rs.getString("ft_Perfil"));
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
}
