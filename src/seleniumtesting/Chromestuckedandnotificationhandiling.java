package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromestuckedandnotificationhandiling {
	WebDriver driver;
	@Before
	public void main() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() {
		driver.get("https://www.justdial.com");
	}

}
