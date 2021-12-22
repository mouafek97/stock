package com.example.Entity;

import java.io.Serializable;
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



public class Lignedecommande implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long indexCmd ;
	private int qteCmd ; 
	private int prixCmd ; 
	private int   montantCmd ; 
	private long ic ; 

	@ManyToOne
	@JoinColumn(name = "idcmd")
	private Commande commande ;
	@ManyToOne
	@JoinColumn(name = "code_article")
	private Article article ;
	public Lignedecommande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lignedecommande(int qteCmd, int prixCmd, Commande commande, Article article) {
		super();
		this.qteCmd = qteCmd;
		this.prixCmd = prixCmd;
		this.commande = commande;
		this.article = article;
		montantCmd=qteCmd*prixCmd ; 
		this.ic=commande.getNumCmd() ;  
		
	}
	
	
}
