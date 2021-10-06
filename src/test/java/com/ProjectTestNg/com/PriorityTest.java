package com.ProjectTestNg.com;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test (priority = (int) -2.5)
	private void Addwaterinthevessel() {
		
		System.out.println("add Water in vessel");
	}
	
	@Test (priority = -1)
	private void SwitchontheGas() {

		System.out.println("switch on the gas");
	}
	
	@Test (priority = 0)
	private void addTeapowderinwaterinsideofvessel() {

		System.out.println("Add the Tea Powder");
	}
	
	@Test (priority =  1)
	private void HeattheteapowderWater() {

		System.out.println("Heat the Tea powder Water till Boil");
	}

	@Test (priority = (int) 2.5)
	private void AddMilkintheTeaWater() {

		System.out.println("Add the Milk in Hot Tea Water");
	}
	
	@Test (priority = 3)
	private void AddSugarasmuchyouwant() {

		System.out.println("Suger Added");
	}
}

