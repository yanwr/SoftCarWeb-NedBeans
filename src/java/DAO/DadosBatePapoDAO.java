
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.DadosBatePapo;

public class DadosBatePapoDAO {
    
    Connection con;
       
    private DadosBatePapo mens;
    private DadosBatePapo dbp;
    

    public DadosBatePapoDAO() {
         con = connectionDB.getConnection();
    }
    
    // add no banco as novas mensagens minhas e do usuario
    public boolean setMsg(DadosBatePapo msg){
        
        try{
            
            String sql = "insert into mensagem(cod_viagem)" + " values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, msg.getCodViagem());
        

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
    public DadosBatePapo getMsg(int codViagem){
        try{
        
            String sql = " select cod_mensagem, cod_viagem, mensagem, user_que_enviou from mensagem where cod_viagem = '"+codViagem+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            
            // variaveis para pegar do banco 
                int codMensagem = 0;
                String msg = null;
                int userQueEnviou = 0;
            //
            
            while(rs.next()){

                codMensagem = rs.getInt("cod_mensagem");
                msg = rs.getString("mensagem");
                userQueEnviou = rs.getInt("user_que_enviou");
                
            }
            
            ps.close();
            rs.close();
            con.close();
            
            mens  = new DadosBatePapo(codMensagem, codViagem, msg, userQueEnviou);
 
        }catch(SQLException e){
            
            System.out.println(e);
        }
        return mens;
    }
    public boolean updMsg(DadosBatePapo dbp){
        try{
        
            String sql = "update mensagem  set mensagem = "+dbp.getMsg()+" where cod_mensagem = '"+dbp.getCodChat()+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, dbp.getMsg());
            
            ps.executeUpdate();
            ps.close();
            con.close();
        
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
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
    
    
}
