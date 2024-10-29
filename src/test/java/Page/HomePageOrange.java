package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageOrange {
	
	@FindBy (xpath = "/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span" )
	List <WebElement> menus ;
	
	@FindBy (xpath = "/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]" )
	WebElement VerifTitre ;
	
	public HomePageOrange () {
		PageFactory.initElements(Config.driver, this);
	}

	public void ClickOnMenu (String menuName) {
		try {
		for(WebElement menu:menus) {
			Config.Attente(10);
			if(menu.getText().contains(menuName)) {
				menu.click();
				
			}
	}
}catch (Exception e) {
	
}
	}
	public void VerifMenu (String menu) {
		Assert.assertEquals(VerifTitre.getText(), menu);
	}
}
