package com.ecommerce.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.ecommerce.domain.Produit;
import com.ecommerce.dto.ProduitDTO;
import com.ecommerce.mapper.ProduitMapper;
import com.ecommerce.repository.ProductRepository;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseTearDown("/listeProduit.xml")
public class ProduitServiceTest extends AbstractContextControllerTests {

	@Autowired
	private ProduitService produitService;

	@Autowired
	private ProductRepository produitRepository;
	
	@Autowired
	private ProduitMapper mapper;

	@Test
	@DatabaseSetup("/listeProduit.xml")
	public void getAllProduct() {
		Assert.assertEquals(3, produitService.getAllProducts().size());

	}

	@Test
	@DatabaseSetup("/listeProduit.xml")
	public void addProduct() {

		Produit produit = produitRepository.findOne(1L);

//		if (mapper.toProductDTO(produit) == null) {
//
//			System.out.println("null????????????????????????");
//		}
		
		
		

		 ProduitDTO produitDTO = mapper.toProductDTO(produit);

		 Produit produitSave = produitService.addProduct(produitDTO);

	}

}
