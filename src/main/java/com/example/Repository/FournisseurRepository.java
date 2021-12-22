package com.example.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long>{

	public Page<Fournisseur> findByNomfContains  (String motCle , Pageable pageable) ;
	
} 

