package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	
	public static WebDriver driver ;
	
	public static void ConfChrome () {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		Attente(10);
	}
	
	public static void maximiseWindow() {
		driver.manage().window().maximize();
	}
	
	public static void Attente (int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

	public static void CloseBrowser () {
		driver.quit();
	}
	

}