package seleniumtesting;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildlocatoramazon {
	
	ChromeDriver driver;
	@Before
	public void testing() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
	}
		public void amazon() {
			driver.findElement(By.xpath("//div[@id=nav-xshop']/a[5]")).click();
			
		}
	}


