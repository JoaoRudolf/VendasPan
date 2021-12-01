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

	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente updateCliente(Integer id, Cliente updatedCliente) {
		return clienteRepository.findById(id).map(c ->{
			c.setNome(updatedCliente.getNome());
			c.setDn(updatedCliente.getDn());
			Cliente atualizado = clienteRepository.save(c);
			return atualizado;
		} ).orElse(null);
	}
	
	
	public Cliente fromDTO(ClienteDTO clienteDTO) {
		Cliente entidade = new Cliente(0,clienteDTO.getNome(),clienteDTO.getDn());
		return entidade;
	}


}
