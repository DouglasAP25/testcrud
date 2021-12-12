package com.daporfiro.testcrud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daporfiro.testcrud.dto.ClientDTO;
import com.daporfiro.testcrud.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	
	// Metodo para buscar todos os clientes
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findall(){
		List<ClientDTO> list = service.findall();
		return ResponseEntity.ok().body(list);
	}
	
	// Metodo de busca por ID
	
	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
		ClientDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

}
