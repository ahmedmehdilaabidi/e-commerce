package com.ecommerce.service;

import java.util.List;

import com.ecommerce.domain.Produit;
import com.ecommerce.dto.ProduitDTO;

public interface ProduitService {
	
	public List<ProduitDTO> getAllProducts();
	
	public Produit addProduct(ProduitDTO product);

}
