package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;

public class cadastroDAO {
    
    Connection com;

    public cadastroDAO() {
         com = connectionDB.getConnection();
    }
    
    public void inserirUser(Usuario user){
        try {
            
            String sql = "insert into usuario(email, senha)" + " values(?,?)";
            PreparedStatement ps = com.prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());
            
            ps.executeUpdate();
            ps.close();
            com.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
