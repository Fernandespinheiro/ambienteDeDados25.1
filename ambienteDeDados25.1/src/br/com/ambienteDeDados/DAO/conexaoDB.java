package br.com.ambienteDeDados.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDB {
	private static final String USERNAME ="root";
	
	private static final String PASSWORD = "1346";
	
	private static final String DATABASE_URL ="jdbc:mysql://localhost:3306/biblioteca";

	public static Connection createConnectionToMySQL() throws SQLException, Exception{
		Class.forName("com.mysql.jdbc.drive");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		
		return connection;
	}
	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();	
		if (con!=null) {
			System.out.println("conexão feita ");
			con.close();
			}
		}
}
