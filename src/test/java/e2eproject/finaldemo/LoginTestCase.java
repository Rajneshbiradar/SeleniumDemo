package e2eproject.finaldemo;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModule.HomePageobject;
import PageObjectModule.LoginPageObject;
import Resources.BaseClass;

public class LoginTestCase extends BaseClass {

@BeforeMethod	//to run always before all the methods becz links is 1st step to perform remaining feature
public void browserlaunch() throws IOException {
	driver = Intialisedriver();
	driver.get("http://www.qaclickacademy.com/");
}
	
	
	@Test(dataProvider="getData")
	public void Basepagenavigation(String username, String password) throws IOException {
		

		HomePageobject HPO = new HomePageobject(driver); // driver passing same for all the object
		HPO.clicksignin().click();

		LoginPageObject LPO = new LoginPageObject(driver); //driver passing to create connection between login page and login test by creating constructor auto
		LPO.enterusername().sendKeys(username); // data passing from data provider
		LPO.enterpasswordname().sendKeys(password);   // data passing from data provider

	}

	@DataProvider    //data provider should be placed outside class
	public Object getData() {

		Object[][] data = new Object[2][2];// 2rows and 2 columns
		data[0][0] = ("test@1"); // 0th row & 0th column
		data[0][1] = ("komal123");
		data[1][0] = ("test@2");
		data[1][1] = ("abcd");
		return data;
	}
}
