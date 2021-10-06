package com.ProjectTestNg.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	//multiple set of datas
	//data provider return type == Object[][] (2d array)
	
	@Test (dataProvider = "My New Data")
	private void login(String Name, String Pass) {
		
		System.out.println("User Name : " + Name);
		System.out.println("Password : " + Pass);
	}

	@DataProvider(name = "My Data")
	private Object[][] inputData1(){ 
	return new Object[][] {{"AAA","135"} , {"AAN","456"}, {"HFG","584"}};
	}
	
	@DataProvider(name = "My New Data")
	private Object[][] inputData(){ 
	return new Object[][] {{"GHB","789"} , {"Asd","485"}, {"ERF","5258"}};
	}
	
	
	}
		

