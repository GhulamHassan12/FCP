package TestNG.implementation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {
 
	@Test
	//@Test(groups="grouping")
	public void test11()
	{
		System.out.println("qa is my future");
	}
	@Test
	//@Test(priority = 2)
	public void test12()
	{
		System.out.println("Qa is not my future");
	}
	@Test
//	@Test(groups="grouping")
	public void test14()
	{
		System.out.println("automation is good for testing");
	}
	@Test
	//@Test(priority = 1)
	//@Parameters({"URL"})
	public void test15()
	{
		System.out.println("automation is not good for testing");
	//	System.out.println(url);
	}
}
