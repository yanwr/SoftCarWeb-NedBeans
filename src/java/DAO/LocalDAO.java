
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
            
            if(pe.equals("Agronômica")){ pe = "Agronomica"; }      
            
            if(pe.equals("Escritório")){ pe = "Escritorio"; }
                
            if(pe.equals("Cacupé")){ pe = "Cacupe"; }
                
            if(pe.equals("Jurerê Internacional")){ pe = "Jurere Internacional"; }
                
            if(pe.equals("Jurerê Tradicional")){ pe = "Jurere Tradicional"; }
                
            if(pe.equals("Saco dos Limões")){ pe = "Saco dos Limoes"; }
                
            if(pe.equals("Jardim Atlântico")){ pe = "Jardim Atlantico"; }
                
            if(pe.equals("Costeira do Pirajubaé")){ pe = "Costeira do Pirajubae"; }
                
            if(pe.equals("Balneário")){ pe = "Balneario"; } 
                
            if(pe.equals("Abraão")){ pe = "Abraao"; }
                
            if(pe.equals("Santa Mônica")){ pe = "Santa Monica"; }
                
            if(pe.equals("Córrego Grande")){ pe = "Corrego Grande"; }
                
            if(pe.equals("José Mendes")){ pe = "Jose Mendes"; }
                
            if(pe.equals("João Paulo")){ pe = "Joao Paulo"; }
                
            if(pe.equals("Armação")){ pe = "Armaçao"; }
                
            if(pe.equals("Pântano do Sul")){ pe = "Pantano do Sul"; }
                
            if(pe.equals("Santo Antônio")){ pe = "Santo Antonio"; }
                
           
            
            
            
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
