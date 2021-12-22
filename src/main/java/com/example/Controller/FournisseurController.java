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
import com.example.Entity.Fournisseur;
import com.example.Repository.FournisseurRepository;

@Controller
public class FournisseurController {
@Autowired
	private FournisseurRepository fournisseurRepository ;
			
@GetMapping(path = "/fournisseurs")
public String fournissuerrrrr(Model model ,
		@RequestParam(name = "page" ,defaultValue = "0") int page ,
		@RequestParam(name = "size" , defaultValue = "5") int size ,
		 @RequestParam(name = "motCle",defaultValue ="" )  String motCle) {
	Page<Fournisseur> pagefourni =fournisseurRepository.findByNomfContains(motCle, PageRequest.of(page, size)) ; 
	
	model.addAttribute("pagefourni", pagefourni ) ; 	
	model.addAttribute("correntpages", page ) ; 	
	model.addAttribute("size", size ) ;
	model.addAttribute("motCle", motCle ) ;	
	model.addAttribute("pages", new int [pagefourni.getTotalPages()]) ;
		
	return "pagefournisseurs"	 ;
	
				
			}
@GetMapping(path = "/deletefournisseurs")
public String delete( Long id ,String page ,String size)  
{
	fournisseurRepository.deleteById(id);
	return "redirect:/fournisseurs?page="+page+"&size"+size;
	
	} 
@GetMapping(path = "/createfour")
public String form (Model model) {
	model.addAttribute("fournisseur" , new Fournisseur())  ; 
                         return "formfour" ; 
                      }
@PostMapping(path = "/savefour")
public String save ( Fournisseur fournisseur ) 
{                      
	fournisseurRepository.save( fournisseur) ; 
	
                     return "redirect:/fournisseurs" ;
}
@GetMapping(path = "/updatefour")
public String edit (Model model , long id ) {
	
Fournisseur fournisseur = fournisseurRepository.findById(id).get() ; 
	model.addAttribute("fournisseur" ,  fournisseur) ; 
                         return "upformfour" ; }}
