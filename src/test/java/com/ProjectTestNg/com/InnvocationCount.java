package com.ProjectTestNg.com;

import org.testng.annotations.Test;

public class InnvocationCount {
	
	//Multiple Times run
	
	@Test (invocationCount = 6)
	public void userName() {

		System.out.println("Thrishan");
	}

}
