package br.com.abc.ZZCjdbc.db;

import br.com.abc.ZZCjdbc.conn.ConexaoFactory;
import com.sun.jdi.connect.spi.Connection;

import java.sql.SQLException;
import java.sql.Statement;
public class CompradorDB {
    public void save() {
        String sql = "INSERT INTO 'agencia'.'comprador'('cpf', 'nome') VALUES ('123.456.789-12', 'Maria')";
        Connection conn = ConexaoFactory.getConexao();
        try {
        Statement stmt = conn.createStatement();
        System.out.println(stmt.executeUpdate(sql));
        ConexaoFactory.close(conn, stmt);
      } catch (SQLException e){
        e.printStackTrace();
    }
  }
}
