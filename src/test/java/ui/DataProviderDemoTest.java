package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemoTest {
	
	@Test(dataProvider="create")
	

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
	
	
	@DataProvider (name="create")
	public Object[][] dataSet1()
	{
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performace_glitch_user","secret_sauce"}};
		
	}
	
	
	
	@DataProvider
	
	//method with return type array
	public Object[][] dataSet()
	
	{
		
		//create array with 4 rows and 2 columns (0th row, 0th column)
		Object[][] dataset = new Object[4][2];
		dataset[0][0] = "user1";  // data for 1st row 1st col
		dataset[0][1] = "pass1";   // data for 1st row 2nd col
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";

		return dataset;
		
	}

}
