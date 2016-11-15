package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.domain.Produit;
/**
 * 
 * @author aml
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Produit, Long> {
	
	

}
