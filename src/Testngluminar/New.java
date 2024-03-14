package Testngluminar;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class New {
	
	
	
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlopen() {
		System.out.println("URL Open");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test(dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(invocationCount=2)
	public void test3() {
		System.out.println("test3");
		
	}
	@AfterMethod
	public void report() {
		System.out.println("report");
	}
	@AfterTest
	public void closebrowser() {
		System.out.println("close the browser");
	}

}
