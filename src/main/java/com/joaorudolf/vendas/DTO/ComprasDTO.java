package com.joaorudolf.vendas.DTO;

import java.time.LocalDate;

import com.joaorudolf.vendas.entities.Compras;

public class ComprasDTO {


	private int id;
	private double totalCompra;
	private LocalDate dataCompra;
	
	private ClienteDTO cliente;

	public ComprasDTO(Compras entidade) {
		this.id = entidade.getId();
		this.totalCompra = entidade.getTotalCompra();
		this.dataCompra = entidade.getDataCompra();
		this.cliente = new ClienteDTO(entidade.getCliente());
	}
	
	public ComprasDTO(int id, double totalCompra, LocalDate dataCompra, ClienteDTO cliente) {
		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
		this.cliente = cliente;
	}
	
	public ComprasDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	
	
}
