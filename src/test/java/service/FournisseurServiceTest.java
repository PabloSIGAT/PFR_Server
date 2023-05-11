package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import com.bigcorp.booking.model.Fournisseur;
import com.bigcorp.booking.service.FournisseurService;
import com.bigcorp.booking.spring.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class FournisseurServiceTest {

	@Autowired
	private FournisseurService fournisseurService;

	@Test
	public void testSave() {
		Fournisseur fournisseur = new Fournisseur();
		fournisseurService.save(fournisseur);
		Assertions.assertNotNull(fournisseur);
		Assertions.assertNotNull(fournisseur.getId());
	}
	  

}
