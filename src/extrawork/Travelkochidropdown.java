package extrawork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Travelkochidropdown {
	 ChromeDriver driver;
	
	@BeforeTest
	public void setdriver() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void loadsite() {
		 driver.get("https://www.holidify.com/places/kochi/packages.html");;
	}
	@Test
	public void travelkochi() {
		
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"sortPackages\"]"));
		
		Select obj=new Select (dropdown);
		//obj.selectByValue("priceLowHigh");
		obj.selectByVisibleText("Duration Min - Max");
		
	List<WebElement>li=obj.getOptions();
	System.out.println(li.size());
	}
}
