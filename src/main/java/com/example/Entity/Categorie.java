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
@Data 

@Entity
public class Categorie  implements Serializable{
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idC ; 
	private String nomCat ; 
private String desCat ; 
@OneToMany(mappedBy = "categorie" , fetch = FetchType.LAZY)
private Collection<Product> articles ;
public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}
public Categorie(String nomCat, String desCat) {
	super();
	this.nomCat = nomCat;
	this.desCat = desCat;
}   


}
