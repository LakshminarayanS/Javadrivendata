package com.ProjectTestNg.com;

import org.testng.annotations.Test;

public class ExceptionDemo {
	
	@Test(expectedExceptions = Throwable.class, priority = 2)
	private void divide() {

		System.out.println("Division");
		System.out.println(10/0);
		
	}
	
}
