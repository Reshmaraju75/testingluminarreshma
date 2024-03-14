package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftextverificaton {
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void reddif() 
	{
		WebElement button=driver.findElement(By.xpath("//*[@id='Register']"));
	String text=	button.getAttribute("value");

	    String expectedtitle="Create my account>>";
	    if(text.equals(expectedtitle));
	    {
	    	System.out.println("pass");
	    }
	    	
	    }
	   
	    
	      }
	






































