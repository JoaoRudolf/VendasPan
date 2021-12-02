package com.joaorudolf.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaorudolf.vendas.DTO.ClienteDTO;
import com.joaorudolf.vendas.DTO.ComprasDTO;
import com.joaorudolf.vendas.entities.Cliente;
import com.joaorudolf.vendas.entities.Compras;
import com.joaorudolf.vendas.repositories.ClienteRepository;
import com.joaorudolf.vendas.repositories.ComprasRepository;

@Service
public class ComprasService {

	@Autowired
	private ComprasRepository comprasRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<ComprasDTO> findAll() {
		clienteRepository.findAll();
		List<Compras>res = comprasRepository.findAll();
		return res.stream().map(c -> new ComprasDTO(c)).collect(Collectors.toList());
	}
	
	public Compras saveCompras(Compras compras) {
		return comprasRepository.save(compras);
	}
	
	public Compras updateCompras(Integer id, Compras updatedCompras) {
		return comprasRepository.findById(id).map(c -> {
			c.setTotalCompra(updatedCompras.getTotalCompra());
			c.setDataCompra(updatedCompras.getDataCompra());
			c.setCliente(updatedCompras.getCliente());
			Compras atualizada = comprasRepository.save(c);
			return atualizada;
		}).orElse(null);
	}
	
	public Compras fromDTO(ComprasDTO comprasDTO) {
		Compras entidade = new Compras(
				0,
				comprasDTO.getTotalCompra(),
				comprasDTO.getDataCompra(),
				new Cliente(comprasDTO.getCliente().getId(),null,null));
		return entidade;
	}

}
