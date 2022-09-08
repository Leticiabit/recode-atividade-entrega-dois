package br.com.viagem.main;

import java.util.Date;
import java.util.Scanner;

import br.com.viagem.dao.ViagemDAO;
import br.com.viagem.model.Viagem;
import br.com.viagem.dao.ClienteDAO;
import br.com.viagem.model.Cliente;
import br.com.viagem.dao.DestinoDAO;
import br.com.viagem.model.Destino;

public class Main {

	public static void main(String[] args) {

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente contato = new Cliente();
		contato.setNome("Vitor");
		contato.setCelular("645646464564");
		contato.setEmail("dasdbaskgmailcom");

		clienteDAO.save(contato);	
	}
}
