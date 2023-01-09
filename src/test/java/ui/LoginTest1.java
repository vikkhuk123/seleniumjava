package ui;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test (groups="regression")
public class LoginTest1 {
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Logn to application");
		
	}
	
	@AfterTest
	
	public void logoutFromApplication()
	{
		System.out.println("Logout from application");
		
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
		
	}
	
	@AfterMethod
	
	public void dissonectFromDB()
	{
		System.out.println("Disconneced from DB");
		
	}
	
	//@Test adds testng library and import testng annotation	
	//Testng runs procedures in alphabetical order unless prioritized 
	
	@Test(priority=2, description="This is a login test")
	public void loginTest()
	{
		
		System.out.println("Login is successful");
		
	}
	
	
	@Test(priority=1)
	public void logoutTest()
	{
		System.out.println("logout successful");
	}
	
	

}
