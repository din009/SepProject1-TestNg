package com.testing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.err.println("After Test");
	}
	
	@BeforeGroups(groups = {"Smoke"})
	public void beforegroup() {
		System.out.println("before Groups");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@Test(priority = 3 , groups = {"Smoke","Regression"})	
	public void testcase1() {
		System.out.println("Testcase 1");
	}
	
	@Test(priority = 1, groups = {"Regression"} )
	public void testcase2() {
		System.out.println("Testcase 2");
	}
	
	@Parameters({"test","test1"})
	@Test(priority = 4, groups = {"Smoke"})
	public void testcase3(boolean data, String text) {
		Assert.assertEquals(data,false);
		System.out.println("Testcase 3");
		System.out.println(text);
	}
	
	@Parameters({"test1"})
	@Test(priority = 2, groups = {"Sanity","Regression"})
	public void testcase4(String data) {
		System.out.println("Testcase 4");
		System.out.println(data);
	}
}
