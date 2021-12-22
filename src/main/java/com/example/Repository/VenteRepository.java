package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Vente;

public interface VenteRepository  extends JpaRepository<Vente, Long>{
	
}
