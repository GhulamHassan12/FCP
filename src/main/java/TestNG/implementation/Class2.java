package TestNG.implementation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	//@Test(priority = 1)
	public void test5()
	{
		System.out.println("I like superior");
	}
	@Test
	//@Test(groups="grouping")
	//@Test(priority = 3)
	public void test6()
	{
		System.out.println("I don't like superior");
	}
	@Test
	//({"URL"})
	public void test7()
	{
		System.out.println("I am happy with you");
	//	System.out.println(url);
	}
	@Test
	//@Test(groups="grouping")
	//@Test(priority = 2)
	public void test8()
	{
		System.out.println("I am not happy with you");
	}

}
