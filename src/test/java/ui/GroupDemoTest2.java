package ui;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

//this @test says this whole class belongs to user-registration group

@Test(groups="user-registraton")
public class GroupDemoTest2 extends CommonDataSetup{
	
	//runs test by different test groups such as regression or bvt
	
	
	
	
	@Test(priority=1,groups="regression")

	public void aTest1()
	{
		System.out.println("test a 1");
		System.out.println(System.getProperty("user.dir"));
		
	}

	@Test(priority=2, groups="regression")

	public void aTest2()
	{
		System.out.println("test a 2");			
		
	}
	
	@Test(priority=3, groups={"regression", "bvt"})

	public void bTest1()
	{
		System.out.println("test b 1");			
		
	}
	
	@Test(priority=4, groups="bvt")
	
	public void bTest2()
	{
				
		System.out.println("test b 2");
	}
	
	
}
