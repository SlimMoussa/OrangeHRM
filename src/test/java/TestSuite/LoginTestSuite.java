package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Page.LoginPageOrange;
import io.cucumber.java.en.*;

public class LoginTestSuite {
	
	@Given("admin is on login page")
	public void admin_is_on_login_page() throws Exception {
		Config.driver = new ChromeDriver();
		Config.ConfChrome();
		Config.Attente(10);
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.maximiseWindow();
		Config.driver.get(url);
	}
	
	@When("admin enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String string, String string2) throws Exception {
		Config.Attente(10);
		LoginPageOrange page = new LoginPageOrange();
		page.connect(string, string2);
	}

	@Then("admin is directed to the home page that contains {string}")
	public void admin_is_directed_to_the_home_page_that_contains(String string) throws Exception {
		Config.Attente(10);
		LoginPageOrange page = new LoginPageOrange();
		page.VerifT(string);
		Config.CloseBrowser();
	}

	@When("admin enter incorrect username {string} and correct password {string}")
	public void admin_enter_incorrect_username_and_correct_password(String string, String string2) throws Exception {
		Config.Attente(10);
		LoginPageOrange page = new LoginPageOrange();
		page.connect(string, string2);
	}

	@Then("admin is still on login page that contains message {string}")
	public void admin_is_still_on_login_page_that_contains_message (String string) throws Exception {
		Config.Attente(10);
		LoginPageOrange page = new LoginPageOrange();
		page.VerifF(string);
		Config.CloseBrowser();
	}
}
