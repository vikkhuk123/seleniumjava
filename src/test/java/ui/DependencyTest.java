package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	
	public void userRegistration()
	{
		System.out.println("This is test1");
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods ="userRegistration", alwaysRun=true) //alwaysRun makes it soft dependency,runs even if userregistration fails
	
	public void userSearch() 
	{
		System.out.println("This is test 2");
	}
}

