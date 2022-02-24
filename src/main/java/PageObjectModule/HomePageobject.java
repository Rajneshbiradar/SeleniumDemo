package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageobject {
	
	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");


	public HomePageobject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}


	public WebElement clicksignin() {
		return driver.findElement(signin);
		
		
	}
	
	
	

}
