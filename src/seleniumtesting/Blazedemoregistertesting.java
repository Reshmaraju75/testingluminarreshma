package seleniumtesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemoregistertesting {

	ChromeDriver driver;
	@Before
	public void enterinto() {
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void enter() {
		driver.findElement(By.id("name")).sendKeys("Reshma");
		driver.findElement(By.id("company")).sendKeys("luminar");
		driver.findElement(By.id("email")).sendKeys("reshmaraju650@gmail.com");
		driver.findElement(By.id("password")).sendKeys("reshma@123");
		driver.findElement(By.id("password-confirm")).sendKeys("reshma@123");
        driver.findElement(By.className("btn btn-primary")).click();
	}
	@After
	public void end() {
		driver.close();;

}
}
