package seleniumtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcontentverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String str=driver.getPageSource();
		if(str.contains("create new account")){
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		}

	}


