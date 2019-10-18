/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class BairroDAO {
    
     Connection com;
     private int id;

    public BairroDAO() {
         com = connectionDB.getConnection();
}
    
    public int pegarIdBairro(String pe){
        try{
            
            String sql = "select cod_bairro from bairro where nome ='"+pe+"'";
            PreparedStatement ps = com.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
          
            while(rs.next()){
                id = rs.getInt("cod_bairro");
            }
            ps.close();
            rs.close();
            com.close();
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
        return "BairroDAO{" + "id=" + id + '}';
    }
    
    
}
