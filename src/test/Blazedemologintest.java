package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Blazeddemolginpage;

public class Blazedemologintest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		 driver=new ChromeDriver();
	}
	@BeforeMethod
	public void geturl() {
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void logintest() {
		 Blazeddemolginpage ob=new  Blazeddemolginpage(driver);
		 ob.setvalues("reshmaraju650@gmail.com", "reshmart@123");
		 ob.login();
	}

}
