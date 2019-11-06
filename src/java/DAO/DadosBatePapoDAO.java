
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DadosBatePapo;

public class DadosBatePapoDAO {
    
    Connection con;
       
    private List<DadosBatePapo> listMsg = new ArrayList();
    private DadosBatePapo msg;
    private DadosBatePapo dbp;
    

    public DadosBatePapoDAO() {
         con = connectionDB.getConnection();
    }
    
    // add no banco as novas mensagens minhas e do usuario
    public boolean setMsg(DadosBatePapo dbp){
        
        try{
            
            String sql = "insert into mensagem(cod_viagem, mensagem, user_que_enviou)" + " values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, dbp.getCodViagem());
            ps.setString(2, dbp.getMsg());
            ps.setInt(3, dbp.getUserQueEnviou());
            
            ps.executeUpdate();
            ps.close();
            con.close();
            
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    // ficar sempre pegando os dados do banco para ficar atualizando o batepapo com as mensagens recem envia/recebidas 
    public List<DadosBatePapo> getMsg(int codViagem){
        try{
        
            String sql = " select cod_mensagem, mensagem, user_que_enviou from mensagem where cod_viagem = '"+codViagem+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while(rs.next()){
                
                msg = new DadosBatePapo();
                
                msg.setCodChat(rs.getInt("cod_mensagem"));
                msg.setMsg(rs.getString("mensagem"));
                msg.setUserQueEnviou(rs.getInt("user_que_enviou"));
                
                listMsg.add(msg);
            }
            
            ps.close();
            rs.close();
            con.close();
            
           
 
        }catch(SQLException e){
            
            System.out.println(e);
        }
        return listMsg;
    }
}
    // pegar nome e fotoPerfil do userMotorista para mandar para a tela Chat e add nos contatos com os dados necessario
//    public DadosBatePapo getDadosMotorista(int cod){
//            try{
//                String sql = "select v.cod_motorista, u.nome as nomeUser, u.foto_perfil as foto_perfil from viagem v "
//                        + "inner join usuario u on u.cod_user = v.cod_motorista where cod_viagem = "+cod+"";
//
//                PreparedStatement ps = con.prepareStatement(sql);
//                ResultSet rs = ps.executeQuery(sql);
//                
//                // variaveis para receber valor do banco
//                    String nomeMotorista = null;
//                    String ftPerfil = null;
//                    int codMotorista = 0;
//                //
//                
//                while(rs.next()){
//                    
//                    codMotorista = rs.getInt("cod_motorista");
//                    nomeMotorista = rs.getString("nomeUser");
//                    ftPerfil = rs.getString("foto_perfil");
//                   
//                }
//                
//                dbp = new DadosBatePapo(cod, nomeMotorista, ftPerfil, codMotorista);
//                
//                rs.close();
//                ps.close();
//                con.close();
//                
//                
//                
//            }catch(SQLException e){
//                System.out.println(e);
//            }
//        return dbp;
//    }
    
    

