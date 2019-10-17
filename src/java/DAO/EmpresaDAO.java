
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaDAO {
    Connection com;
     private int id;

    public EmpresaDAO() {
         com = connectionDB.getConnection();
    }
    
    public int pegarIdEmpresa(String pe){
        try{
            
            String sql = "select cod_empresa from empresa where nome ='"+pe+"'";
            PreparedStatement ps = com.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
          
            while(rs.next()){
                id = rs.getInt("cod_empresa");
            }          
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
        return "EmpresaDAO{" + "id=" + id + '}';
    }
    
    
}
