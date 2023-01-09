package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExternalDataProvider {
	
	@Test(dataProvider="create", dataProviderClass=DataProviderDemo.class)
	

	public void test(String username, String password)
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
		
		
		
	}
	
	@Test(dataProvider="create", dataProviderClass=DataProviderDemo.class)
	
	public void test1(String username, String password, String test)
	
	{
		System.out.println(username+"======="+password+"====="+test);
		
	}

	
	
}
