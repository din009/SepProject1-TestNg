package com.testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.err.println("After Test");
	}

	@Test(groups = {"Sanity"})
	public void Testcase5() {
		System.out.println("Testcase 5");
	}
	@Test(groups = {"Regression"})
	public void Testcase6() {
		System.out.println("Testcase 6");
	}
	@Test(groups = {"Smoke"})
	public void Testcase7() {
		System.out.println("Testcase 7");
	}
	
}
