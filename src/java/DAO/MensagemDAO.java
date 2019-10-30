
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Mensagem;

public class MensagemDAO {
    Connection con;

    public MensagemDAO() {
         con = connectionDB.getConnection();
    }
    
    public boolean addMensagem(Mensagem msg){
        
        try{
            
            String sql = "insert into mensagem(cod_viagem, mensagem, user_que_enviou)" + " values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, msg.getCodViagem());
            ps.setString(2, msg.getMsg());
            ps.setInt(3, msg.getUserQueEnviou());

            ps.executeUpdate();
            ps.close();
            con.close();
            
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }
   
    private Mensagem mens;
    
    public Mensagem getMsg(){
        try{
        
            String sql = "";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            
            // variaveis para pegar do banco 
                int codMensagem = 0;
                int codViagem = 0;
                String msg = null;
                int userQueEnviou = 0;
            //
            
            while(rs.next()){
                
               
                
                codMensagem = rs.getInt("cod_mensagem");
                codViagem = rs.getInt("cod_viagem");
                msg = rs.getString("mensagem");
                userQueEnviou = rs.getInt("user_que_enviou");
                
            }
            
            mens  = new Mensagem(codMensagem, codViagem, msg, userQueEnviou);
            
            
        }catch(SQLException e){
            
            System.out.println(e);
        }
        return mens;
    }
}
