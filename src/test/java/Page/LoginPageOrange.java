package Page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPageOrange {

	@FindBy (name="username")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement BtnLogin;
	
	@FindBy (xpath= "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement errormsg;
	
	@FindBy (xpath= "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement Loginok;
	
	public LoginPageOrange() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void connect (String Name, String PWD ) {
		
		username.sendKeys(Name);
		password.sendKeys(PWD);
		BtnLogin.click();
	}
	public void VerifT (String Verif) {
		Assert.assertEquals(Loginok.getText(), Verif);
	}
	public void VerifF (String Verif) {
		Assert.assertEquals(errormsg.getText(), Verif);
	}
}
