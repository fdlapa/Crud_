package br.com.abc.ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModuloConexao {
    public static Connection conector(){
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bdinfox";
        String user = "root";
        String password = "fabio";
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e){
            // System.out.println(e);
            return null;
        }
    }
}
  public static void close(Connection connection) {
      try {
          if (connection != null)
              connection.close();
      } catch (SQLException e) {
          e.printStackTrace();
      }
  }
      public static void close(Connection connection, Statement stmt){
            close(connection);
            try {
              if (stmt != null)
                  stmt.close();
          } catch (SQLException e){
              e.printStackTrace();
          }
     }

    public static com.sun.jdi.connect.spi.Connection getConexao() {
    }
}
