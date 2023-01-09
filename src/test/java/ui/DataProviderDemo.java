package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	

	@DataProvider (name="create")
	public Object[][] dataSet1(Method m)
	{
		Object[][] testdata = null;
		//returns two values if method name = test, three alues if method name = test1
		
		if(m.getName().equals("test"))
		{
			testdata =  new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performace_glitch_user","secret_sauce"}};
		} 
			else if(m.getName().equals("test1")) {
			testdata = new Object[][] {
			{"standard_user","secret_sauce", "test"},
			{"locked_out_user","secret_sauce","test"},
			{"problem_user","secret_sauce","test"},
			{"performace_glitch_user","secret_sauce","test"}};
		}
		
			return testdata;
		
	}
	
	

}
