package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestnGAnnotations {

	@Test
	public void testCase()
	{
		System.out.println("Test case");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before methodtest");
		
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("at after method");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
}
