package com.example.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Entity.Categorie;
import com.example.Entity.Commande;
import com.example.Entity.Lignedecommande;
import com.example.Repository.CommandeRepository;
import com.example.Repository.LignedecommandeRepository;

@Controller
public class CommendeController {
@Autowired
private CommandeRepository commandeRepository ; 
@Autowired
LignedecommandeRepository lcr ; 

@GetMapping(path = "/listedecommandes")
public String commandes(Model model ,
@RequestParam(name = "page" ,defaultValue = "0") int page ,
@RequestParam(name = "size" , defaultValue = "5") int size ,
@RequestParam(name = "motCle",defaultValue ="" )  String motCle) {
Page <Commande> pagecmd =commandeRepository.findByNomCmdContains(motCle, PageRequest.of(page, size)) ; 
model.addAttribute("pageCmd", pagecmd) ; 	
model.addAttribute("correntpages", page ) ; 	
model.addAttribute("size", size ) ;
model.addAttribute("motCle", motCle ) ;	
model.addAttribute("pages", new int [pagecmd.getTotalPages()]) ;

return "pagecommandes"	 ; }

	

	

@GetMapping(path = "/deletecommande")
public String delete( Long id ,String page ,String size)  {

	commandeRepository.deleteById(id);
return "redirect:/listedecommandes?page="+page+"&size"+size; 
}





@GetMapping(path = "/createco")
public String form (Model model) {
	model.addAttribute("commande" , new Commande()) ; 
                         return "formcoo" ; }


                         @PostMapping(path = "/savecoo")
                     	public String save ( Commande commande ) 
                     	{                      
                        	 commandeRepository.save( commande) ; 
                     		
                     	                     return "redirect:/listedecommandes" ;                         
                         
                         
                         
                         
                         
}
@GetMapping(path = "/voir")
public String voirl(Model model ,
@RequestParam(name = "page" ,defaultValue = "0") int page ,
@RequestParam(name = "size" , defaultValue = "15") int size ,long id ) {
Page <Lignedecommande> pageli =lcr.findByIc(id,  PageRequest.of(page, size)) ; 
model.addAttribute("pageli", pageli) ; 	
model.addAttribute("correntpages", page ) ; 	
model.addAttribute("size", size ) ;
model.addAttribute("id", id ) ;	
model.addAttribute("pages", new int [pageli.getTotalPages()]) ;

return "vlpage"	 ; }






@GetMapping(path = "/createligne")
public String formli(Model model) {
	model.addAttribute("ligne" , new Lignedecommande()) ; 
                         return "formligne" ; }


                         @PostMapping(path = "/saveligne")
                     	public String saveli( Lignedecommande lignedecommande ) 
                     	{                      
                        	 lcr.save( lignedecommande) ; 
                     		
                     	                     return "redirect:/voir" ;                        
                     	}}









