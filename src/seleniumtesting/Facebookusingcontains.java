package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookusingcontains {
	
	ChromeDriver driver;
	@Before
	public void test() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
		}
	@Test
	public void login() {
		driver.findElement(By.id("email")).sendKeys("7902863974");
		driver.findElement(By.id("pass")).sendKeys("906143");
driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
	}

}
