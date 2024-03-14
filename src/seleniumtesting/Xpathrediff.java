package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathrediff {
	ChromeDriver driver;
	@Before
	public void testing() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
		public void amazon() {
			driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"))
			.sendKeys("Reshma");
			
			driver.findElement(By.xpath("//*[@id='wrapper']/table/tbody/tr/td/a/img")).click();
			
}
}
