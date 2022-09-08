package br.com.viagem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.viagem.factory.ConnectionFactory;
import br.com.viagem.model.Destino;

public class DestinoDAO {

	public void save(Destino contato){

		String sql = "INSERT INTO Destino(pais, cidade, valor, id_destino) VALUES (?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setString(1, contato.getPais());
			pstm.setString(2, contato.getCidade());
			pstm.setFloat(3, contato.getValor());
			pstm.setInt(4, contato.getId_destino());

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
