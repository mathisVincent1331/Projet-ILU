package entity;

import entity.NomArticle;

public class Article {
	private int idArticle;
	private NomArticle nomArticle;
	private int quantite;
	
	public Article(int idArticle, int quantite) {
		this.idArticle = idArticle;
		this.quantite = quantite;
	}
	
	
}
