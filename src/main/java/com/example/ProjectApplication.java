package com.example;

import java.time.LocalDateTime;
import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.Entity.Article;
import com.example.Entity.Categorie;
import com.example.Entity.Commande;
import com.example.Entity.Fournisseur;
import com.example.Entity.Lignedecommande;
import com.example.Entity.Lignedevente;
import com.example.Entity.Vente;
import com.example.Repository.ArticleRepository;
import com.example.Repository.CategorieRepository;
import com.example.Repository.CommandeRepository;
import com.example.Repository.FournisseurRepository;
import com.example.Repository.LignedecommandeRepository;
import com.example.Repository.LignedeventeRepository;
import com.example.Repository.VenteRepository;

@SpringBootApplication
public class ProjectApplication  implements CommandLineRunner {
	
	
	
	@Autowired
	private FournisseurRepository fournisseurRepository ;
   @Autowired
	private CategorieRepository categorieRepository ; 
	@Autowired
   private ArticleRepository articleRepository ;
  @Autowired
	private CommandeRepository commandeRepository ; 
  @Autowired
  private LignedecommandeRepository lignedecommandeRepository ;
@Autowired 
private VenteRepository venteRepository ;
@Autowired
private LignedeventeRepository lignedeventeRepository ; 

   
   public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	
	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
 Fournisseur f1 = fournisseurRepository.save(new Fournisseur("ali", "tunis", 11111111, "aligmail.com")) ; 
 Fournisseur f2 = fournisseurRepository.save(new Fournisseur("med", "tunis", 22222222, "medgmail.com")) ; 
 Fournisseur f3 = fournisseurRepository.save(new Fournisseur("salah", "tunis", 33333333, "salahgmail.com")) ; 
 Fournisseur f4 = fournisseurRepository.save(new Fournisseur("amin", "tunis", 44444444, "amingmail.com")) ; 
 Fournisseur f5 = fournisseurRepository.save(new Fournisseur("ala", "tunis", 55555555, "alagmail.com")) ; 
 Fournisseur f6 = fournisseurRepository.save(new Fournisseur("anis", "tunis", 66666666, "anisgmail.com")) ; 
 Fournisseur f7= fournisseurRepository.save(new Fournisseur("ali2", "tunis", 11111111, "ali2gmail.com")) ; 
 Fournisseur f8 = fournisseurRepository.save(new Fournisseur("med2", "tunis", 22222222, "med2gmail.com")) ; 
 Fournisseur f9 = fournisseurRepository.save(new Fournisseur("salah2", "tunis", 33333333, "salah2gmail.com")) ; 
 Fournisseur f10 = fournisseurRepository.save(new Fournisseur("amin2", "tunis", 44444444, "amin2gmail.com")) ; 
 Fournisseur f11= fournisseurRepository.save(new Fournisseur("ala2", "tunis", 55555555, "ala2gmail.com")) ; 
 Fournisseur f12= fournisseurRepository.save(new Fournisseur("anis2", "tunis", 66666666, "anis2gmail.com")) ; 


 
 Categorie c1 = categorieRepository.save(new Categorie("electromenager", "produit service a maison ")) ; 
 Categorie c2 = categorieRepository.save(new Categorie("jeuxvidio", "jeux pour enfant ")) ; 
 Categorie c3 = categorieRepository.save(new Categorie("livre", "toute les langue ")) ; 
 Categorie c4 = categorieRepository.save(new Categorie("ordinateur", "prix et qualite")) ; 
 Categorie c5 = categorieRepository.save(new Categorie("smartphone", "indisponsable ")) ; 
 Categorie c6 = categorieRepository.save(new Categorie("meuble", "pour  maison ")) ; 
 
 
 Article art1 =articleRepository.save(new Article("chauffage", "par unite", 10, 1200,c1)) ; 
 Article art2 =articleRepository.save(new Article("climatisseur", "par unite", 10, 1300, c1)) ; 
 Article art3 =articleRepository.save(new Article("table", "par unite", 20, 800, c6)) ; 
 Article art4 =articleRepository.save(new Article("chaise", "par unite", 120, 15, c6)) ; 
 Article art5 =articleRepository.save(new Article("iphone", "par unite", 5, 15000, c5)) ; 
 Article art6 =articleRepository.save(new Article("xomi", "par unite", 10, 700, c5)) ; 
 Article art7 =articleRepository.save(new Article("hp100", "par unite", 12, 2200, c4)) ; 
 Article art8 =articleRepository.save(new Article("dell50", "par unite", 12, 2300, c4)) ; 
 Article art9 =articleRepository.save(new Article("chauffage", "par unite", 10, 1200, c1)) ; 
 Article art10 =articleRepository.save(new Article("climatisseur", "par unite", 10, 1300, c1)) ; 
 Article art11 =articleRepository.save(new Article("table", "par unite", 20, 800, c6)) ; 
 Article art12 =articleRepository.save(new Article("chaise", "par unite", 120, 15, c6)) ; 
 Article art13 =articleRepository.save(new Article("iphone", "par unite", 5, 15000, c5)) ; 
 Article art14 =articleRepository.save(new Article("xomi", "par unite", 10, 700, c5)) ; 
 Article art15 =articleRepository.save(new Article("hp100", "par unite", 12, 2200, c4)) ; 
 Article art16 =articleRepository.save(new Article("dell50", "par unite", 12, 2300, c4)) ; 
 
 
 Commande cmd1 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 1, 10, 10), "en cour", "ali", f1));
 Commande cmd2 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 1, 10, 11), "en cour", "ali", f1));
 Commande cmd3 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 1, 10, 12), "en cour", "ali", f1));
 Commande cmd4 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 1, 10, 13), "en cour", "ali", f1));
 Commande cmd5 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 1, 10, 14), "en cour", "ali", f1));
 
 Commande cmd6 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 2, 15, 10), "en cour", "ali", f1));
 Commande cmd7 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 2, 15, 11), "en cour", "ali", f1));
 Commande cmd8 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 2, 15, 12), "en cour", "ali", f1));
 Commande cmd9 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 2, 15, 13), "en cour", "ali", f1));
 Commande cmd10 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 1, 2, 15, 14), "en cour", "ali", f1));
 
 Commande cmd11 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 11, 19, 9, 41), "en cour", "ali", f1));
 Commande cmd12 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 11, 19, 9, 42), "en cour", "ali", f1));
 Commande cmd13 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 11, 19, 9, 43), "en cour", "ali", f1));
 Commande cmd14 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 11, 19, 9, 44), "en cour", "ali", f1));
 Commande cmd15 =commandeRepository.save(new Commande(LocalDateTime.of(2020, 11, 19, 9, 45), "en cour", "ali", f1));










 




  
 
 
 
 
 
Lignedecommande l1 = lignedecommandeRepository.save(new Lignedecommande(10, 1000, cmd1, art1)) ;
Lignedecommande l2 = lignedecommandeRepository.save(new Lignedecommande(20, 1100, cmd1, art2)) ;
Lignedecommande l3 = lignedecommandeRepository.save(new Lignedecommande(30, 700, cmd1, art3)) ;
Lignedecommande l4 = lignedecommandeRepository.save(new Lignedecommande(40, 80, cmd1, art4)) ;
Lignedecommande l5 = lignedecommandeRepository.save(new Lignedecommande(40, 80, cmd1, art5)) ;
 
Lignedecommande l6 = lignedecommandeRepository.save(new Lignedecommande(10, 1000, cmd2, art1)) ;
Lignedecommande l7 = lignedecommandeRepository.save(new Lignedecommande(20, 1100, cmd2, art2)) ;
Lignedecommande l8 = lignedecommandeRepository.save(new Lignedecommande(30, 700, cmd2, art3)) ;
Lignedecommande l9 = lignedecommandeRepository.save(new Lignedecommande(40, 80, cmd2, art4)) ;
Lignedecommande l10 = lignedecommandeRepository.save(new Lignedecommande(40, 80, cmd2, art5)) ;


Vente v1 = venteRepository.save(new Vente(new Date(), "en cour")) ; 
Vente v2 = venteRepository.save(new Vente(new Date(), "terminer")) ; 


Lignedevente lv1 = lignedeventeRepository.save(new Lignedevente(10, art1, v1)) ; 
Lignedevente lv2=lignedeventeRepository.save(new Lignedevente(10, art2, v1)) ; 
Lignedevente lv3 = lignedeventeRepository.save(new Lignedevente(10, art3, v1)) ; 
Lignedevente lv4=lignedeventeRepository.save(new Lignedevente(10, art4, v1)) ; 
Lignedevente lv5 = lignedeventeRepository.save(new Lignedevente(10, art5, v1)) ; 
Lignedevente lv6=lignedeventeRepository.save(new Lignedevente(10, art6, v1)) ; 


Lignedevente lv7 = lignedeventeRepository.save(new Lignedevente(10, art1, v2)) ; 
Lignedevente lv8=lignedeventeRepository.save(new Lignedevente(10, art2, v2)) ; 
Lignedevente lv9 = lignedeventeRepository.save(new Lignedevente(10, art3, v2)) ; 
Lignedevente lv10=lignedeventeRepository.save(new Lignedevente(10, art4, v2)) ; 
Lignedevente lv11 = lignedeventeRepository.save(new Lignedevente(10, art5, v2)) ; 
Lignedevente lv12=lignedeventeRepository.save(new Lignedevente(10, art6, v2)) ; 
	
	
	
	
	}}
