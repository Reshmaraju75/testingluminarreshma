package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpagefactory;

public class Fblogintestpagefactory {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver() ;
	}
	@BeforeMethod
	public void urlloading() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testlogin() {
		Fbloginpagefactory obj=new Fbloginpagefactory(driver);
		obj.setvalues("reshmaraju650@gmail.com","reshma@123");
		obj.login();
	}

}
