package br.com.abc.ZZCjdbc.test;

import br.com.abc.ZZCjdbc.conn.ConexaoFactory;
import br.com.abc.ZZCjdbc.db.CompradorDB;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    public static void main (String[] args){
        CompradorDB compradorDB = new CompradorDB();
        compradorDB.save();
    }
}
