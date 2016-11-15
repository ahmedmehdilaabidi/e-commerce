package com.ecommerce.mapper;

import org.springframework.stereotype.Component;

import com.ecommerce.domain.Taille;

@Component("produitTailleMapper")
public class ProduitTailleMapper {

	public Taille toTaille(String taille) {

		if (taille.equals("S"))
			return Taille.S;
		else if (taille.equals("L"))
			return Taille.L;
		else
			return null;

	}

}
