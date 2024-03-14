package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutexpathfacebook { 
	ChromeDriver driver;
	
	@Before
	public void start() {
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void Testpath() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]"
				+ "/div[1]/div/div/div/div[2]/div/div[1]/form/div[1"
				+ "]/div[2]/div/input")).sendKeys("reshmart@123");
			
	}
	public void close() {
		driver.close();
	}

}
