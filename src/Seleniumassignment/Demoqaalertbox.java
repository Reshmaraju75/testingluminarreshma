package Seleniumassignment;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqaalertbox 

{
ChromeDriver driver;
String text="Do you confirm action?";
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	}
@Test
public void Alertbox() {
	driver.findElement(By.id("confirmButton")).click();
	Alert a=driver.switchTo().alert();
	String text=a.getText();
	if(text.equals("text")){
		a.accept();
		System.out.println("pass");
	}
	//else {
	//	System.out.println("fail");
//	}
	//driver.switchTo().alert().accept();
			
			//String alertMessage= driver.switchTo().alert().getText(); 
	//System.out.println(alertMessage);
	//a.accept();
}

	
}
