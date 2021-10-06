package com.ProjectTestNg.com;

import org.testng.annotations.Test;

public class TimeOutTest {
	
	@Test(timeOut = 5000) //Higher Value
	private void lunchtheBrowser() throws Throwable {

		System.out.println("Chrome");
		Thread.sleep(3000);	// Lower Value
		System.out.println("Sucess");
		
	}

}
