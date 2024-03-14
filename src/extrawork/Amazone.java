package extrawork;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
ChromeDriver driver;
@Before
public void setup() {
	
	driver=new ChromeDriver();
	driver.get("http://www.amazone.in");
	
}
@Test
public void test() {
	driver.findElement(By.xpath("//*[@id=\"ab-sign-in-ingress-link\"]/span"));
	String str=driver.getPageSource();
	if(str.contains("Shop on Amazone Business"));
	{
		System.out.println("pass");
		
	}
	
	
}
}
