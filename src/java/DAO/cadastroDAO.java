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
            
            String sql = "insert into usuari(email, senha)" + " values(?,?)";
            PreparedStatement stmt = com.prepareStatement(sql);
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSenha());
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
