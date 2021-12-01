package com.joaorudolf.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.joaorudolf.vendas.DTO.ClienteDTO;
import com.joaorudolf.vendas.entities.Cliente;
import com.joaorudolf.vendas.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> findAll() {
		List<ClienteDTO> lista = clienteService.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<ClienteDTO>saveCliente(@RequestBody ClienteDTO clienteDTO) {
		Cliente entidade = clienteService.fromDTO(clienteDTO);
		clienteService.saveCliente(entidade);
		return new ResponseEntity<ClienteDTO>(clienteDTO,HttpStatus.CREATED);
	}
}
