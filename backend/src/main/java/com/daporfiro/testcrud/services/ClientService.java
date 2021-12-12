package com.daporfiro.testcrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daporfiro.testcrud.entities.Client;
import com.daporfiro.testcrud.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findall() {
		return repository.findAll();
		
	}
	
}
