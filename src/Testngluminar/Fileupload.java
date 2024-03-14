package Testngluminar;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	 ChromeDriver driver;
	 @	BeforeTest
	 public void setup() {
		  driver=new ChromeDriver();
	 }
	 @BeforeMethod()
	 public void urlopen() {
		  driver.get("https://demo.guru99.com/test/upload/");
		  driver.manage().window().maximize();
	 }
	 @Test
	 public void uploadfile() {
		 
		 driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("file:///C:/Users/Reshma/Downloads/Testing%20levelsdoc%20.pdf");
		
	 }

}
