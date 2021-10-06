package com.ProjectTestNg.com;

import org.testng.annotations.Test;

public class GroupingTest {
	
	//IOS, Andriod, Windows, intel
	
	@Test (groups = "IOS")
	private void iphone() {

			System.out.println("IPhone");
	}
	
	@Test (groups = "IOS")
	private void imac() {

			System.out.println("Imac");
	}
	
	@Test (groups = "Andriod")
	private void samsung() {

			System.out.println("Samsung Phone");
	}

	@Test (groups = "Andriod")
	private void samsungTab() {

			System.out.println("Tab");
	}
	
	@Test (groups = "Windows")
	private void dell() {

			System.out.println("Dell Laptop");
	}
	
	@Test (groups = "Windows")
	private void hp() {

			System.out.println("hp laptop");
	}
	
	@Test (groups = "Intel")
	private void intel() {

			System.out.println("Chip");
	}
}
