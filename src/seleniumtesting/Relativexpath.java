package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void setup() {
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("reshmaraju650@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("906143");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
