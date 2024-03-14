package Seleniumassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonetestngmultiwindow {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void start() {
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void amazonetest() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones",Keys.ENTER);
		 String title=	driver.getTitle();
		    System.out.println(title);
		    String expectedtitle="amazon.in:mobilephones";
		    if(title.equals(expectedtitle));
		    {
		    	System.out.println("pass");
		    }
	}

	
		  //  else
		    {
	//	    	System.out.println("failed");
	 //   }
		//    String parentwindow=driver.getWindowHandle();
		    
		 //   driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/"
		  //  		+ "div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		   Set<String> child=driver.getWindowHandles();
		   for(String handle:child) {
			//   if(!handle.equalsIgnoreCase(parentwindow)) {
				   driver.switchTo().window(handle);
				   driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
			   }
		   }
	}
	

//}
