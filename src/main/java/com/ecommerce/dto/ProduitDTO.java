package com.ecommerce.dto;

import com.ecommerce.domain.Taille;

public class ProduitDTO {
	
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
	private Taille tailleType;
	/**
	 * ce champ est la prix unitaire du Produit.
	 */
	private long prix;
	
	
	public ProduitDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ProduitDTO(Long idProduit, String referenceProduit, String nom, String description, Taille tailleType,
			long prix) {
		super();
		this.idProduit = idProduit;
		this.referenceProduit = referenceProduit;
		this.nom = nom;
		this.description = description;
		this.tailleType = tailleType;
		this.prix = prix;
	}
	
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getReferenceProduit() {
		return referenceProduit;
	}
	public void setReferenceProduit(String referenceProduit) {
		this.referenceProduit = referenceProduit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Taille getTailleType() {
		return tailleType;
	}
	public void setTailleType(Taille tailleType) {
		this.tailleType = tailleType;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	
	
	
	

}
