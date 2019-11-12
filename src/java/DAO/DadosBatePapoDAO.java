
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DadosBatePapo;
import model.Usuario;

public class DadosBatePapoDAO {
    
    Connection con;
       
    private List<DadosBatePapo> listMsg = new ArrayList();
    private List<Usuario> listContato = new ArrayList();
   
    private Usuario us;
    private DadosBatePapo msg;
    private DadosBatePapo dbp;
    

    public DadosBatePapoDAO() {
         con = connectionDB.getConnection();
    }
    
    // add no banco as novas mensagens minhas e do usuario
    public boolean setMsg(DadosBatePapo dbp){
        
        try{
            if(dbp.getMsg() != null && dbp.getMsg() != "" && dbp.getMsg() != " " ){
                String sql = "insert into mensagem(cod_user, mensagem, user_que_enviou)" + " values(?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, dbp.getCodUser());
                ps.setString(2, dbp.getMsg());
                ps.setInt(3, dbp.getUserQueEnviou());

                ps.executeUpdate();
                ps.close();
                con.close();
            }
        }catch(SQLException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    // ficar sempre pegando os dados do banco para ficar atualizando o batepapo com as mensagens recem envia/recebidas 
    public List<DadosBatePapo> getMsg(int codUser, int codMeu){
        try{
        
            //String sql = " select cod_mensagem, mensagem, user_que_enviou from mensagem where cod_user = '"+codUser+"'";
            String sql = " select cod_mensagem, mensagem, user_que_enviou from mensagem where (cod_user = '"+codMeu+"' and user_que_enviou = '"+codUser+"') or (user_que_enviou = '"+codMeu+"' and cod_user = '"+codUser+"' ) ";
          
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
    
    public List<Usuario> contatos(int codMeu){
        
        try {
            String sql = "SELECT * FROM usuario where cod_user IN (SELECT DISTINCT cod_user FROM mensagem where "
                    + "user_que_enviou = '"+codMeu+"' and cod_user != '"+codMeu+"') or cod_user IN (SELECT DISTINCT user_que_enviou"
                    + " FROM mensagem where cod_user = '"+codMeu+"' and user_que_enviou != '"+codMeu+"')";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            
            while(rs.next()){
                us = new Usuario();
                
                us.setId(rs.getInt("cod_user"));
                us.setNomeUser(rs.getString("nome"));
                us.setFotoPerfil(rs.getString("foto_perfil"));
                listContato.add(us);
            }
            
            rs.close();
            ps.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listContato;
    }
}