package com.example.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
	public Page<Article> findByDesignationContains  (String mc , Pageable pageable ) ;
}
