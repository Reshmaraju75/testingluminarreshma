package seleniumtesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifybuttonscheckbox {

	ChromeDriver driver;
	@Before
	public void check() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void verify() {
	Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).isSelected();
	if(b) {
		System.out.println("selected");
	}
	else
		System.out.println("not selected");
	}
	
	public void display() {
	//	Boolean c=driver.findElement(By.xpath(""))
	}
	public void verifydrop() {
  Boolean a=driver.findElement(By.xpath("//*[@id=\"country\"]")).isEnabled();
  if(a) {
	  System.out.println("enabled");
  }
  else {
	  System.out.println("not enabled");
  }
	}
	
	             
}
