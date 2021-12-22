package com.example.Entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;
@Data
@Entity

public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numCmd ; 
	private LocalDateTime dateCmd ; 
	private String etatCmd ;
	private String nomCmd ; 
	private String nomfour ; 
	
	
	@ManyToOne
	@JoinColumn(name = "numero_four")
	private Fournisseur fournisseur ; 
	
	@OneToMany(mappedBy = "commande" , fetch = FetchType.LAZY)
	private Collection<Lignedecommande> lignedecommandes ;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande( LocalDateTime dateCmd, String etatCmd, String nomCmd, Fournisseur fournisseur) {
		super();
		this.dateCmd =  LocalDateTime.now() ; 
		this.etatCmd = etatCmd;
		this.nomCmd = nomCmd;
		this.fournisseur = fournisseur;
		this.nomfour = fournisseur.getNomf() ; 
	}

	
	}
	
	
	


