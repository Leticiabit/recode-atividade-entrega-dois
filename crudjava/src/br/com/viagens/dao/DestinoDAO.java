package br.com.viagens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.viagens.factory.ConnectionFactory;

public class DestinoDAO {
	String sql = "INSERT INTO Destino(pais, cidade, valor, id_destino) VALUES (?, ?, ?, ?)";

	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = ConnectionFactory.createConnectionToMySQL();
		pstm = (PreparedStatement) conn.prepareStatement(sql);
		pstm.setString(1, contato.getPais());
		pstm.setString(2, contato.getCidade());
		pstm.setInt(2, contato.getValor());
		pstm.setInt(2, contato.getId_destino());

		pstm.execute();
		
		System.out.println("Registro salvo com sucesso!");
		
	}catch (Exception e){
		e.printStackTrace();
		
	} finally {
		
		try {
			
			if(pstm!=null) {
				pstm.close();
			}
			
			if(conn!=null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
}
