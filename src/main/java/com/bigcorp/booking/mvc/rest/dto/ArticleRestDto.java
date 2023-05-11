package com.bigcorp.booking.mvc.rest.dto;

import com.bigcorp.booking.model.Article;
import com.bigcorp.booking.model.EtatArticle;

public class ArticleRestDto {
	
	private Integer id;
	private String nom;
	private EtatArticle etatArticle;
	private String description;		
	
	public ArticleRestDto(Article article) {
		this.id = article.getId();		
		this.nom = article.getNom();
		this.etatArticle = article.getEtatArticle();
		this.description = article.getDescription();		
	}
	
	public Integer getId() {
		return id;
	}	

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public EtatArticle getEtatArticle() {
		return etatArticle;
	}

	public void setEtatArticle(EtatArticle etatArticle) {
		this.etatArticle = etatArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

	public Article remplisArticle(Article articleLu) {
		articleLu.setId(this.id);		
		articleLu.setNom(this.nom);
		articleLu.setEtatArticle(this.etatArticle);
		articleLu.setDescription(this.description);		
		return articleLu;
	}
	
	public ArticleRestDto() {
	}

}
