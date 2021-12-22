package com.example.Entity;

import java.io.Serializable;
import java.util.Collection;

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


public class Article implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  artCode ; 

	private String designation ; 

private String unite ; 

private int qteArt ;

private int prixArt ;

private String catn ; 
@OneToMany(mappedBy = "article" , fetch = FetchType.LAZY)
private Collection<Lignedecommande> lignedecommandes ; 
@ManyToOne
@JoinColumn(name = "categorie_id	")
private Categorie categorie ; 
@OneToMany(mappedBy = "article" , fetch = FetchType.LAZY)
private Collection<Lignedevente> lignedeventes ;
public Article() {
	super();
	// TODO Auto-generated constructor stub
}
public Article(String designation, String unite, int qteArt, int prixArt,  Categorie categorie) {
	super();
	this.designation = designation;
	this.unite = unite;
	this.qteArt = qteArt;
	this.prixArt = prixArt;
	this.catn=categorie.getNomCat() ; 
	
	
}   


}
