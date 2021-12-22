package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Entity.Article;
import com.example.Repository.ArticleRepository;
@Controller
public class ArticleController {
	@Autowired
	private ArticleRepository articleRepository ; 
	
	
	@GetMapping(path = "/Article")
	public String articleee(Model model ,
			@RequestParam(name = "page" ,defaultValue = "0") int page ,
			@RequestParam(name = "size" , defaultValue = "4") int size ,
			 @RequestParam(name = "motCle" , defaultValue = "" )  String motCle) {
		Page<Article> pageproduits =articleRepository.findByDesignationContains(motCle, PageRequest.of(page, size));
		model.addAttribute("pageproduits",pageproduits) ; 
		model.addAttribute("correntpages", page ) ; 	
		model.addAttribute("size", size ) ;
		model.addAttribute("motCle", motCle ) ;	
		model.addAttribute("pages", new int [pageproduits.getTotalPages()]) ;
			
		return "pagearticle"	 ;

	}
	
	@GetMapping(path = "/deleteArticle")
	public String delete(long id ,String motCle , String page, String size  ) {
		articleRepository.deleteById(id);
	return "redirect:/Article?page="+page+"&motCle="+motCle+"&size="+size;

}
	
	@GetMapping(path = "/createArticle")
	public String form (Model model) {
		model.addAttribute("article" , new Article()) ; 
	                         return "formArticle" ; 
	                      }
	@PostMapping(path = "/saveart")
	public String save ( Article article ) 
	{                      
		                 articleRepository.save(article) ; 
		
	                     return "redirect:/Article" ;
	}
	
	@GetMapping(path = "/updateArticle")
	public String edit (Model model , long id ) {
		
	Article article = articleRepository.findById(id).get() ; 
		model.addAttribute("article" ,  article) ; 
	                         return "upart" ; 


	}}