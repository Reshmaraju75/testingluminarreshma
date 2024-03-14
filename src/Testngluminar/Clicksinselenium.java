package Testngluminar;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clicksinselenium {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	@Test
	public void test() {
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	
		Actions act=new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("clicked :edit")){
		
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		a.accept();
				
			}
	
	@Test
	public void test2() {
		WebElement doublec=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doublec);
		act.perform();
		
		Alert ar=driver.switchTo().alert();
		String text=ar.getText();
		if(text.equals("You double clicked me.. Thank You..")){
		
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		ar.accept();
				
			}
		
	
	}
	


