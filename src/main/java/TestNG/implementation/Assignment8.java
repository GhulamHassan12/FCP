package TestNG.implementation;

import org.testng.annotations.Test;

public class Assignment8 {
	
	@Test(groups="grouping")
	//(priority = 1)
	public void test1()
	{
		System.out.println("I am a student");
	}
	@Test(groups="grouping")
	//(priority = 3)
	public void test2()
	{
		System.out.println("I am not a student");
	}
	@Test
	(priority = 4)
	public void test3()
	{
		System.out.println("I am luck boy");
	}
	@Test
	(priority = 2)
	public void test4()
	{
		System.out.println("I am not lucky boy");
	}
	

}
