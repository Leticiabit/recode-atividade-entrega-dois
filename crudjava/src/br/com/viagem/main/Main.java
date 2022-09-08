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

		// Insere cliente
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente contato = new Cliente();
		contato.setNome("Vitor");
		contato.setCelular("645646464564");
		contato.setEmail("dasdbaskgmailcom");

		clienteDAO.save(contato);

		// Insere destino
		DestinoDAO destinoDAO = new DestinoDAO();
		Destino destino = new Destino();
		destino.setPais("Egito");
		destino.setCidade("Cairo");
		destino.setValor(300);
		
		destinoDAO.save(destino);
		
		
	}
}
