package com.Test;

import org.testng.annotations.Test;

public class InvocationCountTest {


@Test(invocationCount=10)
//Same test case again and again 
//If we want to execute the same test again and again
//then we can use invocation count
//Generate the same report again and again 

public void Sum()
{

int a=10;
int b=20;
int c=a+b;
System.out.println(c);

}

}

