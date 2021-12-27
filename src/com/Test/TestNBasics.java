package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNBasics {
	// We never work with main method in TestNG
	// We dont need main method excecutor
	// TestNg will automatically execute our class.
	// We have features avaliable in form of annotations

	// First Annotation
	// Annotation starts with @
	// With each and every annotation we have method

	@BeforeSuite // Executed First 1
	public void Setup() {
		System.out.println("Setup System Property for Chrome");
	}

	@BeforeTest // 2
	public void LaunchBrowser() {
		System.out.println("Launch The Browser");
	}

	@BeforeClass // 3
	public void Login() {
		System.out.println("Login To the App");
	}

	@BeforeMethod // 4
	public void EnterUrl() {
		System.out.println("EnterUrl");
	}

//Above are pre-requisities 
//Only One @Test means only one test case.
	@Test // 5
	public void GoogleTitleTest() {
		System.out.println("GoogleTitleTest");
	}
	@Test
	public void SearchTest()
	{
		System.out.println("This is my Second Test Case");
	}
	
	@Test
	public void GoogleLogoTest()
	{
		System.out.println("GoogleLogoTest");
	}
//Each and every annotation should be associated with one method 
//We cannot write only annotation.
//Once the test is done we want to define post conditions

//Post Condition 
	@AfterMethod // 6

	public void LogOut() {
		System.out.println("Log Out from the Application");
	}

	@AfterClass // 7

	public void CloseBrowser() {
		System.out.println("Close the Browser");
	}

	@AfterTest //8
	
	public void deleteallcookies()
	{
		System.out.println("Delete All Cookies");
	}
}
//	@AfterSuite //9
//	 public void generatereport()
//	 {
//		System.out.println("Generate the Test Report");
//	 }
//	
//	
//	}

//Sequence is important for TestNG Class.
//Pair will be created for the @BeforeMethod @Test @AfterMethod

//In any TestNG class we have three conditions.
//Execution sequence of each and every annotation is different.
//No of Test Case=No of @Test Annotation
//We can create n number of Test Cases.
//Pair is created for each and every test case.No of test case is equal to the number of pairs created
//Randomly it will pick test cases.
//Pair will be created only and only with @before method @test @after method.
//In real time we dont define all the annotations.It depends on Project.
//Sequence is more important

