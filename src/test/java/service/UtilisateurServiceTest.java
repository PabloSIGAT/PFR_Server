package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import com.bigcorp.booking.model.Utilisateur;
import com.bigcorp.booking.service.UtilisateurService;
import com.bigcorp.booking.spring.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class UtilisateurServiceTest {

	@Autowired
	private UtilisateurService utilisateurService;

	@Test
	public void testSave() {
		Utilisateur utilisateur = new Utilisateur();
		utilisateurService.save(utilisateur);
		Assertions.assertNotNull(utilisateur);
		Assertions.assertNotNull(utilisateur.getId());
	}	  

}
