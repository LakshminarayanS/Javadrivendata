package com.ProjectTestNg.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ParameterValues {
	
	//parameter --> Singe set of data
	//@Optional
	//xml--> Perameters
	
	@Test
	private void Demo(@Optional("Lakshmi") String a) {

		System.out.println("User Name" +a);
	}
	

}
