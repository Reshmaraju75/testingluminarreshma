package Seleniumassignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
		@Test
		public void amazonetest() {
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
    //	driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[2]")).click();
		

		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]/div")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("reshmaraju766@gmailgf");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]")).click();
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		}

}
