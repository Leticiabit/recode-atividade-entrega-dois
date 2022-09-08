package br.com.viagem.model;

import java.util.Date;

public class Viagem {

	private Date datavoo;
	private Date datacompra;
	private int id_destino;
	private int id_cliente;
	//Getters and setters

	public Date getDatavoo() {
		return datavoo;
	}
	public void setDatavoo(Date datavoo) {
		this.datavoo = datavoo;
	}
	public Date getDatacompra() {
		return datacompra;
	}
	public void setDatacompra(Date datacompra) {
		this.datacompra = datacompra;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_destino() {
		return id_destino;
	}
	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}
}
			