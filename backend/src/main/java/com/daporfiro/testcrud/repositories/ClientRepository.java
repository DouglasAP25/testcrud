package com.daporfiro.testcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daporfiro.testcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
