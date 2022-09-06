package br.com.viagens.main;

import br.com.viagens.model.Viagens;
import br.com.viagens.dao.ViagensDAO;

public class Main {

	public static void main(String[] args) {
			
		ViagensDAO viagensDao = new ViagensDAO();

		Viagens contato = new Viagens();
		contato.setNome("vitor");
		contato.setCelular("11");
		contato.setEmail("vitorverdegmailcom");
		contato.setId_cliente(3);

		viagensDao.save(contato);
	}

}
