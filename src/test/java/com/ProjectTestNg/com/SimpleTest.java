package com.ProjectTestNg.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {

	
	//STCM
	//Suite Test Class Method
	
	@BeforeSuite
	private void browserSetUp() {

		System.out.println("Browser Set");
	}
	
	@BeforeTest
	private void driverIntialization() {

		System.out.println("Driver Intialized");
	}
	
	@BeforeClass
	private void url() {

		System.out.println("URL Added");
	}
	
	@BeforeMethod
	private void login() {

		System.out.println("Login");
	}
	
	@Test
	private void searchMobile() {

		System.out.println("Mobile purchased");
	}
	
	@AfterMethod
	private void logout() {

		System.out.println("Chrome");
	}
	
	@AfterClass
	private void tearDownBrowser() {

		System.out.println("Browser Closed");
	}
	
	@AfterTest
	private void verification() {

		System.out.println("Verified Browser application closed");
	}
	
	@AfterSuite
	private void deleteCookies() {

		System.out.println("Cookies Deleted");
	}
	
	
}
