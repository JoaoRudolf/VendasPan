package com.joaorudolf.vendas.DTO;

import com.joaorudolf.vendas.entities.Cliente;

public class RankingComprasDTO {

	private String nomeCliente;
	private Double valorTotalCompra;

	public RankingComprasDTO() {

	}

	public RankingComprasDTO(Cliente cliente, Double valorTotalCompra) {
		super();
		this.nomeCliente = cliente.getNome();
		this.valorTotalCompra = valorTotalCompra;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getValorTotalCompra() {
		return valorTotalCompra;
	}

	public void setValorTotalCompra(Double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

} // end of class
