package br.com.viagens.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.viagens.factory.ConnectionFactory;
import br.com.viagens.model.Viagens;

public class ClientesDAO {

public void save(Viagens contato){
		
		String sql = "INSERT INTO Cliente(nome, celular, email) VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, contato.getNome());
			pstm.setString(2, contato.getCelular());
			pstm.setInt(3, contato.getId_cliente());
			
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
