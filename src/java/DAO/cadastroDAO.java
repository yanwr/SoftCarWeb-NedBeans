package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Usuario;

public class cadastroDAO {
    
    Connection con;

    public cadastroDAO() {
         con = connectionDB.getConnection();
    }
    
    public boolean inserirUser(Usuario user){
        try {
            
            String sql = "insert into usuario(email, senha, nome)" + " values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());
            ps.setString(3, user.getNomeUser());
            
            ps.executeUpdate();
            ps.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
