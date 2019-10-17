
package DAO;

public class PostarCorridaDAO {
    
    Connection com;

    public PostarCorridaDAO() {
         com = connectionDB.getConnection();
    }
    
    public void addCorridaSaidandoEmpresa(PostarCorrida pc){
        
           try{
               String sql = "insert into viagem(cod_motorista, cod_empresa, cod_bairro, data_postagem, hora_postagem, data_saida, hora_saida, taxa, assentos)"
                       + "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement ps = com.prepareStatement(sql);
               ps.setInt(1, pc.getMotorista());
               ps.setInt(2, pc.getSaida());
               ps.setInt(3, pc.getDestino());
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
    public void addCorridaSaidandoBairro(PostarCorrida pc){
        
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
}
