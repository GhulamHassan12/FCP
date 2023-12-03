package TestNG.implementation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	//@Parameters({"URL"})
	//@Test(priority = 3) 
	public void test1()
	{
		System.out.println("my name is hassan");
	//	System.out.println(url);
	}
	@Test
	//@Test(priority = 4)
	public void test2()
	{
		System.out.println("hp laptop is good");
	}
	@Test
	//@Test(groups="grouping")
	//@Test(priority = 2)
	public void test3()
	{
		System.out.println("superior university lahore");
	}
	@Test
	//@Test(groups="grouping")
	//@Test(priority = 1)
	public void test4()
	{
		System.out.println("superior university gold campus");
	}
	

}
