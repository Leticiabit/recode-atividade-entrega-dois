package br.com.viagem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.viagem.factory.ConnectionFactory;
import br.com.viagem.model.Cliente;

public class ClienteDAO {

	public void save(Cliente contato){
		
		String sql = "INSERT INTO Cliente(nome, celular, email) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getCelular());
			pstm.setString(3, contato.getEmail());
			
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
