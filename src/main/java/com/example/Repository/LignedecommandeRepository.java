package com.example.Repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Lignedecommande;

public interface LignedecommandeRepository  extends JpaRepository<Lignedecommande, Long>{
	public Page<Lignedecommande> findByIc (long id , Pageable pageable )  ; 

	
}
