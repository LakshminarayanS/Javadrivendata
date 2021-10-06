package com.ProjectTestNg.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	@Test
	private void Red() {
		
		System.out.println("Red");
	}
	
	@Test
	private void Green() {
		
		System.out.println("Green");
	}
	
	@Ignore
	@Test
	private void Blue() {
		
		System.out.println("Blue");
	}

	@Test (enabled = false)
	private void Yellow() {
		
		System.out.println("Yellow");
	}

}
