package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	By Username = By.xpath("//input[@id='user_email']");//used xpath selector can be use CSS by removing the symbols
	By Password = By.xpath("//input[@id='user_password']");
	By login = By.xpath("//input[@value='Log In']");
	
	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		
	}

	public WebElement enterusername() {
		return driver.findElement(Username);
		
	}

	public WebElement enterpasswordname() {
		return driver.findElement(Password);
		
	}
	
	public WebElement clicklogin() {
		return driver.findElement(login);
		
	}
	
}
