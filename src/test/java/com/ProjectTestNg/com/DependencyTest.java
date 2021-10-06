package com.ProjectTestNg.com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	private void browserSetUp() {

		System.out.println("Browser Set");
	}
	
	@Test (dependsOnMethods = "browserSetUp")
	private void driverIntialization() {

		System.out.println("Driver Intialized");
	}
	
	@Test (dependsOnMethods = "driverIntialization")
	private void url() {

		System.out.println("URL Added");
	}
	
	@Test (dependsOnMethods = "url")
	private void login() {

		System.out.println("Login");
	}
	
	
	
	
}
