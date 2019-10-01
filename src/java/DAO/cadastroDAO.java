package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class cadastroDAO {
    
    Connection com = connectionDB.connection();
    
    public void cadUser(Usuario user){
        
        try {
            String sql = "insert into Usuario(nome, senha) values(?,?)";
            PreparedStatement stmt = com.prepareStatement(sql);
            stmt.setObject(1, user.getNome());
            stmt.setObject(2, user.getSenha());
            stmt.execute();
            stmt.close();
            
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
    
}
