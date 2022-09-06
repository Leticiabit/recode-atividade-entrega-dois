package br.com.viagens.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// Nome do usuario mysql
	private static final String USERNAME = "root";
	
	//senha banco
	private static final String PASSWORD = "E7g7PRZvtsstrFF";
	
	//Caminho do banco de dados, porta, nome
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/crud_atividade";
	
	//Conexão banco de dados
	public static Connection createConnectionToMySQL() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}	
	
	public static void main(String[] args) throws Exception{
		
		//Recuperar uma conexão com o banco de dados
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexão é nula
		if(con!=null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
}
