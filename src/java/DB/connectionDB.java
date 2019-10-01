package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connectionDB {
    
    public static Connection connection(){
      
        Connection connection = null;

        try {            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/softcarweb","root","root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
    
    public static void main(String[] args){
        connectionDB con = new connectionDB();
        System.out.println("BD conectado "+con.connection());
    }
}

