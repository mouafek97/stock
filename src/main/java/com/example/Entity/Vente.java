package com.example.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.ToString;
@Data
@Entity	


public class Vente  implements Serializable{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numVt ;
private Date dateVt ; 
private String etatVt ; 
@OneToMany(mappedBy = "vente" , fetch = FetchType.LAZY)
private Collection<Lignedevente> lignedeventes ;
public Vente( Date dateVt, String etatVt){
	super();
	
	this.dateVt = dateVt;
	this.etatVt = etatVt;
	}
	
public Vente() {
	super();
	// TODO Auto-generated constructor stub
}



}
