
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LocalDAO {
    Connection con;
    private int id;
    
    public LocalDAO(){
        con = connectionDB.getConnection();
    }
    
    public int pegarIdLocal(String pe){
        try{
            
            String sql = "select cod_local from local where nome ='"+pe+"'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
          
            while(rs.next()){
                id = rs.getInt("cod_local");
            }
            
            ps.close();
            rs.close();
            con.close();
        }catch(SQLException ex){
               System.out.println(ex);
        }
         return id; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "LocalDAO{" + "id=" + id + '}';
    }
    
    
    
}
