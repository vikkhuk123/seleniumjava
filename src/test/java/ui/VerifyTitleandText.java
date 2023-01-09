package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleandText {
	@Test
	

	public void titleTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualTitle = driver.getTitle();
		
		//if this is true then test will pass
		//this is a hard assertion - if fails, script stops there
		System.out.println("Veryfying title");
		
		AssertJUnit.assertEquals(actualTitle, expectedtitle);
		
		String expectedtest = "Search";
		String actualtest = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		
		System.out.println("Verifying text");
		
		AssertJUnit.assertEquals(actualtest, expectedtest, "Text verification failed");
		
		System.out.println("Closing browser");
		
		driver.close();
		
		
		
		
		
		
	}
	
	
}
