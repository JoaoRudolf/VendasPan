package com.joaorudolf.vendas.DTO;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.joaorudolf.vendas.entities.Cliente;
import com.joaorudolf.vendas.entities.Compras;

public class ComprasDTO {


	private int id;
	private double totalCompra;
	private LocalDate dataCompra;

	public ComprasDTO(Compras compras) {
		this.id = compras.getId();
		this.totalCompra = compras.getTotalCompra();
		this.dataCompra = compras.getDataCompra();
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
}
