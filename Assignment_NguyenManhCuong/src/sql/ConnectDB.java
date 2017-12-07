package sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection getConnection() {
      Connection connection = null;
      try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Login";
        connection = DriverManager.getConnection(url, "sa", "123456");
        //connection = DriverManager.getConnection(url, "mc", "123456");
      } 
      catch (Exception e) {
        e.printStackTrace();
      }
      return connection;  
    }
}
