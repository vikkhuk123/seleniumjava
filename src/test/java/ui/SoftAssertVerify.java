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
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertVerify {
	@Test
	

	public void titleTest()
	{
		
		SoftAssert softassert = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String expectedtitle = "Electronicsfdfdf, Cars, Fashion, Collectibles & More | eBay";
		String actualTitle = driver.getTitle();
		

		System.out.println("Veryfying title");
		//if this is true then test will pass. will not stop script if fails b/c it's soft assert
		AssertJUnit.assertEquals(actualTitle, expectedtitle, "Title verification failed");
		
		
		String expectedtest = "Searchddfdf";
		String actualtest = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		
		System.out.println("Verifying text");
		
		AssertJUnit.assertEquals(actualtest, expectedtest, "Text verification failed");
		
		System.out.println("Closing browser");
		
		driver.close();
		
		softassert.assertAll();
		
		
		
		
		
		
		
	}
	
	
}
