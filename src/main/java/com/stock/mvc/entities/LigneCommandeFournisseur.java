package com.stock.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeFournisseur implements Serializable {
	   
	   @Id
	   @GeneratedValue
	   private Long idLigneCdeFrs; 
	
	   @ManyToOne
	   @JoinColumn(name="idArticle")
	   private Article article;
	   
	   @ManyToOne
	   @JoinColumn(name="idCommandeFournisseur")
	   private CommandeFournisseur commandeFournisseur;

    	public LigneCommandeFournisseur() {
	    	super();
	    	// TODO Auto-generated constructor stub
    	}

		public Long getIdLigneCdeFrs() {
			return idLigneCdeFrs;
		}

		public void setIdLigneCdeFrs(Long idLigneCdeFrs) {
			this.idLigneCdeFrs = idLigneCdeFrs;
		}

		public Article getArticle() {
			return article;
		}

		public void setArticle(Article article) {
			this.article = article;
		}

		public CommandeFournisseur getCommandeFournisseur() {
			return commandeFournisseur;
		}

		public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
			this.commandeFournisseur = commandeFournisseur;
		}

		
	   
    	
	   

}
