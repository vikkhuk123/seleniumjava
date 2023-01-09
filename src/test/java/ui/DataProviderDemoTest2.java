package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest2 {
	
	@Test(dataProvider="dataSet")
	

	public void test(String username, String password)
	
	{
		System.out.println(username+"======="+password);
		
	}
	
	@Test(dataProvider="dataSet1")
	

	public void test(String username, String password, String test)
	
	{
		System.out.println(username+"======="+password+"====="+test);
		
	}
	
	@DataProvider
	public Object[][] dataSet1()
	{
		
		return new Object[][] {
			{"username","password", "test"},
			{"username2","password2", "test2"},
			{"username3","password3", "test3"},
			{"username4","password4", "test4"}};
		
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
