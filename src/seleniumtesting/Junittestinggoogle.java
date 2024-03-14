package seleniumtesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;


public class Junittestinggoogle {

	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification() {
		String title=driver.getTitle();
		System.out.println(title);
		String expectedstring="google";
		if(title.equals(expectedstring)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");;
		}
	}
	@Test
	public void contentverification() {
		String str=driver.getPageSource();
		if(str.contains("create new account")){
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		
	}
	@After
	public void endcode() {
		driver.close();
	}

}
