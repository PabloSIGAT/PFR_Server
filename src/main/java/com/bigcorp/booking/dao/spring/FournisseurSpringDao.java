package com.bigcorp.booking.dao.spring;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bigcorp.booking.model.Fournisseur;

@Repository
public interface FournisseurSpringDao extends CrudRepository<Fournisseur, Integer> {    
	// JPQL requetes SQL en JPA
	public List<Fournisseur> findByNom(String nomFournisseur);
	
}
