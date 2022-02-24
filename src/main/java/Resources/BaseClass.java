package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
public WebDriver Intialisedriver() throws IOException
{
	
	Properties prop = new Properties();
	
	FileInputStream fis = new FileInputStream
			("C:\\Users\\Rajanish\\eclipse-workspace\\finaldemo\\src\\main\\java\\Resources\\Data.properties");
	
	prop.load(fis);
	String Browsername = prop.getProperty("Browser");
	
	if(Browsername.equals("Chrome"))   //chrome.equals=chrome (true)becz browser = chrome in dataproperties
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajanish\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();    //Webdriver removed becz mentioned in intial
	}
	else if(Browsername.equals("Firefox"))
	{
		//firefoxcode
	}
	else
	{
		//Internetexplorer code
	}

  return driver;
	
	
	
	
}
}
