package ui;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//this @test says this whole class belongs to user-registration group

public class SkipDemoTest {
	
	Boolean datasetup = false;

	@Test(enabled = false)
	public void skipTest1() {

		System.out.println("skipping this test as it is not complete");
	}

	@Test
	public void skipTest2() {

		System.out.println("skipping this test forcefully with throwexception");
		throw new SkipException("skipping this test");
	}

	@Test
	public void skipTest3() {
		
		

		System.out.println("skipping this test based on condition of datasetup");
		
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		} else
		{
			System.out.println("Do not execute further steps - condition not met");
			throw new SkipException("Do not execute further steps - based on condition");
		}

	}

}
