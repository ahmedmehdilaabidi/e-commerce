package com.ecommerce.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * 
 * @author aml
 *
 */
@Entity
public class Produit {
	/**
	 * ce champ est l'id dans la base donnes.
	 */
	private Long idProduit;
	/**
	 * ce champ est la reference de Produit.
	 */
	private String referenceProduit;
	/**
	 * ce champ est le nom du Produit.
	 */
	private String nom;
	/**
	 * ce champ est la description de la Produit.
	 */
	private String description;
	/**
	 * ce champ est une enumeration aui decrit la taille de Produit.
	 */
	private String taille;
	/**
	 * ce champ est la prix unitaire du Produit.
	 */
	private long prix;
	
	/**
	 * c'est un constructeur par defaut.
	 */
	public Produit() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdProduit() {
		return idProduit;
	}

	/**
	 * 
	 * @param idProduit.
	 */
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	/**
	 * 
	 * @return
	 */
	public String getReferenceProduit() {
		return referenceProduit;
	}

	/**
	 * 
	 * @param referenceProduit
	 */
	public void setReferenceProduit(String referenceProduit) {
		this.referenceProduit = referenceProduit;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	

	public void setPrix(long prix) {
		this.prix = prix;
	}
	
	public long getPrix() {
		return prix;
	}

	

	/**
	 * 
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

}
