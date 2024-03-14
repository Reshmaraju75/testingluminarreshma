package Testngluminar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;
	String baseurl="https://www.trivago.in/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void geturl() {
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test 
	public void testlogin() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[3]/div/div/button[2]")).click();
		while(true) {
			WebElement month=driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/h3"));
			String months=month.getText();
			if(months.equalsIgnoreCase("march 2024")) {
				System.out.println(months);
				break;
			}
			else {
				driver.findElement(By.xpath("")).click();
			}
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/div/button"));
				for(WebElement dateelement:alldates) {
					String date=dateelement.getText();
					System.out.println(date);
					dateelement.click();
					System.out.println("date selected");
					
				}
	}
	

}
