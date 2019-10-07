package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
    
    public static Connection getConnection(){
      
        Connection connection = null;

        try {            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/softcar?serverTimezone=UTC","root","master123");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
    
    public static void main(String[] args){
        System.out.println("BD conectado "+connectionDB.getConnection());
    }
}

