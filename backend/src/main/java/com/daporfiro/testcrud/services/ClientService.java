package com.daporfiro.testcrud.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daporfiro.testcrud.dto.ClientDTO;
import com.daporfiro.testcrud.entities.Client;
import com.daporfiro.testcrud.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findall() {
		List<Client> list = repository.findAll();
		List<ClientDTO> listDto = new ArrayList<>();
		for (Client client: list) {
			listDto.add(new ClientDTO(client));
		}
		return listDto;		
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.get();
		return new ClientDTO(entity);
	}
	
}
