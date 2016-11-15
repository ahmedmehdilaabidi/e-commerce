package com.ecommerce.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.ecommerce.domain.Produit;
import com.ecommerce.dto.ProduitDTO;

@Mapper(uses={ProduitTailleMapper.class},componentModel="spring")
public interface ProduitMapper {
	
	@Mappings({@Mapping(source="taille",target="tailleType"),})
	ProduitDTO toProductDTO(Produit produit);
	
	List<ProduitDTO> toProductDTOs(List<Produit> produit);
	
	@Mappings({@Mapping(source="tailleType",target="taille"),})
	Produit toProduct(ProduitDTO produitDTO);
	
	

}
