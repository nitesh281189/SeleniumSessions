package com.Test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {




@Test(timeOut=2000,expectedExceptions=NumberFormatException.class)

public void InfiniteLoopTest()
{
	int i=1;
	
	{
		String x="100A";
				Integer.parseInt(x);
		System.out.println(i);
	}
}
//If a test case is stuck anywhere due to any issue we cannot terminate automatically
//Manually we have to terminate
//We can terminate automatically also by using timeout settings 
//ExceptedException is also a keyword used commonly 


}
//Without  the try catch block we can handle exceptions in TestNG 
//We can give expected Exceptions in TestNG
//Normally if any excetpion we have to mark the test case as failed.


