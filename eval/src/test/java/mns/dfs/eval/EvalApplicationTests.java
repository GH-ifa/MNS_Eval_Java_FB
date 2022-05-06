package mns.dfs.eval;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class EvalApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private WebApplicationContext context;

	private MockMvc mvc;

	@BeforeEach
	private void init (){

		mvc = MockMvcBuilders
				.webAppContextSetup(context)
				.build();
	}


	@Test
	void appelApiGetListeEmploye_retourne2Employe() throws Exception {
		// Est-ce que ma liste d'utilisateurs contient 4 utilisateurs
		mvc.perform(MockMvcRequestBuilders.get("/liste-employe").accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(2)));
	}

	@Test
	void appelApiGetUnEmploye_retourneLaBonnePersonne() throws Exception {
		// Est-ce que mon employe est bien l'employe 3 du nom de "admin", est administrateur, et a 2 articles à gérer
		mvc.perform(MockMvcRequestBuilders.get("/employe/{id}", 3).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(3))
				.andExpect(jsonPath("$.login").value("admin"))
				.andExpect(jsonPath("$.administrateur").value(true))
				.andExpect(jsonPath("$.listeArticleAgerer", hasSize(2)));

	}

	@Test
	void appelApiGetListeCommande_retourne1Commande() throws Exception {
		// Est-ce que ma liste de commandes contient 1 seule commande
		mvc.perform(MockMvcRequestBuilders.get("/liste-commande").accept(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$", hasSize(1)));
	}
}
