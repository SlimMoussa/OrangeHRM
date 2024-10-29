package TestSuite;

import Helper.Config;
import Page.HomePageOrange;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTestSuite {
	
	
	@When("Utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menu) throws Exception {
		Config.Attente(10);
		HomePageOrange home = new HomePageOrange();
		home.ClickOnMenu(menu);
	}
	
	@Then("La page menu est affiché {string}")
	public void la_page_menu_est_affiché(String x) throws Exception {
		Config.Attente(10);
		HomePageOrange home = new HomePageOrange();
		home.VerifMenu(x);
		Config.CloseBrowser();
	}

}
