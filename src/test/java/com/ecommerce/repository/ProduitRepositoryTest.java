package com.ecommerce.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.ecommerce.domain.Produit;
import com.ecommerce.domain.Taille;
import com.ecommerce.service.AbstractContextControllerTests;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.ExpectedDatabase;

/**
 * 
 * @author aml
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DatabaseTearDown("/listeProduit.xml")
public class ProduitRepositoryTest extends AbstractContextControllerTests {

	@Autowired
	private ProductRepository produitRepository;

	@Test
	@DatabaseSetup("/listeProduit.xml")
	public void getAllProduct() {
		Assert.assertEquals(3, produitRepository.count());
		Produit produit = produitRepository.findOne(1L);

		Assert.assertEquals(produit.getNom(), "P1");
	}

	@Test
	@DatabaseSetup("/listeProduit.xml")
	public void addProduct() {

		Produit produit = produitRepository.findOne(1L);
		produitRepository.save(produit);
	}

}
