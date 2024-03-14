package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazedemoregisterpage;

public class Blazedemoregisterpagetest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void testregister() {
		 Blazedemoregisterpage ob=new  Blazedemoregisterpage(driver);
				 ob.setvalues("reshma","luminar","reshmaraju650@gmail.com","reshmart@123","reshmart@123");
		         ob.register();
	}

}
