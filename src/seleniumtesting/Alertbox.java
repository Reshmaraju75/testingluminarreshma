package seleniumtesting;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	ChromeDriver driver;     
	
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Reshma/Html/sample.html");
	}
	public void verifybutton() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert();
		driver.findElement(By.xpath("/html/body/input[2]"));
		driver.findElement(By.xpath("/html/body/input[3]"));


	
	}
}


