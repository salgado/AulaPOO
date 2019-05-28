package bd.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.*;
import com.poo.jdbc.ConnectionFactory;

public class Teste {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
    }
}