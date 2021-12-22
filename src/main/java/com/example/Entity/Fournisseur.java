package com.example.Entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;
@Data @Entity 



public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String nomf ;
	private String adress ;
	private int numtelephone ; 
	private String email ;
	@OneToMany(mappedBy = "fournisseur" ,fetch = FetchType.LAZY)	
	private Collection<Commande> commandes ;
	

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Fournisseur(String nomf, String adress, int numtelephone, String email) {
		super();
		this.nomf = nomf;
		this.adress = adress;
		this.numtelephone = numtelephone;
		this.email = email;
	}
	
	

}
