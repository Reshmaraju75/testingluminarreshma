package Testngluminar;

import org.testng.annotations.Test;

public class Groupingselenium {

	@Test(groups={"sanity"})
	public void test1()
	{
		System.out.println("sanity testing done in test1");
	}
	@Test(groups={"sanity","smoke"})
	public void test2() {
		System.out.println("grouped sanity and smoke in test2");
		
	}
	@Test(groups= {"regression"})
	public void test3() {
		System.out.println("regression done in test3");
	}
	@Test(groups= {"sanity","regression"})
	public void test4() {
		System.out.println("grouped sanity and regression in test4");
	}
}
