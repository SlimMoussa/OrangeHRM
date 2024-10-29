package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPageOrange;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	
	@Given("Utilisateur est connécté avec le bon username et le bon password")
	public void utilisateur_est_connécté_avec_le_bon_username_et_le_bon_password() throws Exception {
		Config.driver = new ChromeDriver();
		Config.ConfChrome();
		Config.Attente(10);
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.maximiseWindow();
		Config.driver.get(url);
	   LoginPageOrange page = new LoginPageOrange();
	   page.connect("Admin", "admin123");
	}
	
}
