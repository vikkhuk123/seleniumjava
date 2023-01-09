package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	@Test
	

	public void titleTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualTitle = driver.getTitle();
		
		//if this is true then test will pass
		AssertJUnit.assertEquals(actualTitle, expectedtitle);
		
		
		
		
		
	}
	
	
}
