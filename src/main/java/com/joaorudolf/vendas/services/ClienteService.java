package com.joaorudolf.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaorudolf.vendas.DTO.ClienteDTO;
import com.joaorudolf.vendas.entities.Cliente;
import com.joaorudolf.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public List<ClienteDTO> findAll() {
		List<Cliente>res = clienteRepository.findAll();
		return res.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
	}



}
