package com.Test;

import org.testng.annotations.Test;

public class TestNgFeatures {


@Test

public void LoginTest()
{
	System.out.println("LoginTest");
//int a=9/0;	//airthmatic exception.
}

@Test(dependsOnMethods="LoginTest")

public void HomePageTest()
{
	System.out.println("HomePageTest");
	}

//If login test is passed then only homepage test executed 
//If Login test is failed ,homepage test is not executed 
//homepage test is totally dependent on login test
//dependsonMethod is important for TestNg

@Test(dependsOnMethods="LoginTest")

public void Searchpage()
{
	System.out.println("SearchPage");}



@Test(dependsOnMethods="LoginTest")

public void RegistrationPage()
{
	System.out.println("RegistrationPage");}

}
