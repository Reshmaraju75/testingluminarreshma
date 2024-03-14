package seleniumtesting;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {
	
	ChromeDriver driver;
	@Before
	public void begin() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
	}
@Test
public void test() {
	WebElement daydrpdown=driver.findElement(By.id("day"));
	Select day=new Select(daydrpdown);
	day.selectByValue("25");
	WebElement monthdrpdown=driver.findElement(By.id("month"));
	Select month=new Select(monthdrpdown);
	month.selectByIndex(8);
	WebElement yeardrpdown=driver.findElement(By.id("year"));
	Select year=new Select(yeardrpdown);
	year.selectByVisibleText("2002");
	
	List<WebElement>li=month.getOptions();
	System.out.println(li.size());
	
	List<WebElement>li1=day.getOptions();
	System.out.println(li1.size());
	
	List<WebElement>li2=year.getOptions();
	System.out.println(li2.size());
}
}
