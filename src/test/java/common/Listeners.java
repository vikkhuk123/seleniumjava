package common;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
		System.out.println("Test case is starting");
		Reporter.log("a href='www.google.com'");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed - screenshot captured");
		try {
			getScreenshot();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false"); //lets you do html tags in reportng
		Reporter.log("<a href='https://www.google.com'>test test</a/>");
	
	}
	
	public void onTestSuccess(ITestResult result) {
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}

}
