package br.com.viagem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.viagem.factory.ConnectionFactory;
import br.com.viagem.model.Viagem;

public class ViagemDAO {

	public void save(Viagem contato) {

		String sql = "INSERT INTO Viagem(id_cliente, id_destino) VALUES (?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, contato.getId_cliente());
			pstm.setInt(2, contato.getId_destino());

			pstm.execute();

			System.out.println("Registro salvo com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			try {

				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}