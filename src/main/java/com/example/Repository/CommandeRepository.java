package com.example.Repository;


import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Commande;


public interface CommandeRepository  extends JpaRepository<Commande, Long>{
	public Page<Commande> findByNomCmdContains  (String motCle , Pageable pageable) ;
	
}
