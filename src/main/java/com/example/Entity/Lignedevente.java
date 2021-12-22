package com.example.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;


import lombok.Data;
import lombok.ToString;

@Data
@Entity	


public class Lignedevente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long indexVt ;
	private int qteVt; 
	private int prixVt;
	
	private double montantvt ; 
	@ManyToOne
	@JoinColumn(name = "code_article")
	private Article article ; 
	@ManyToOne
	@JoinColumn(name = "id_vente")
	private Vente vente ;
	
	public Lignedevente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lignedevente(int qteVt, Article article, Vente vente) {
		super();
		this.qteVt = qteVt;
		this.prixVt = article.getPrixArt();
		this.article = article;
		this.vente = vente;
		montantvt = prixVt*qteVt;
	}

	
	

}
