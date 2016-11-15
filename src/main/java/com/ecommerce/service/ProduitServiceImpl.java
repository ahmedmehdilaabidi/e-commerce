package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.domain.Produit;
import com.ecommerce.dto.ProduitDTO;
import com.ecommerce.mapper.ProduitMapper;
import com.ecommerce.repository.ProductRepository;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProduitMapper mapper;

	@Override
	public List<ProduitDTO> getAllProducts() {
		// TODO Auto-generated method stub
		return mapper.toProductDTOs(productRepository.findAll());
	}

	public Produit addProduct(ProduitDTO productDTO) {

		Produit produitMapper = mapper.toProduct(productDTO);

		Produit produit = productRepository.save(produitMapper);

		return produit;
	}

}
